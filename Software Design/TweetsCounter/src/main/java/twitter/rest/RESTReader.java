package twitter.rest;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ksenia on 26.09.17.
 */
public class RESTReader {
    private static final String BEARER_TOKEN_PREFIX = "Bearer ";
    private static final String HASHTAG_PREFIX = "%23";
    private final String searchApiUrl;
    private final String authValue;

    public RESTReader(String searchApiUrl, String authValue) {
        this.searchApiUrl = searchApiUrl;
        this.authValue = BEARER_TOKEN_PREFIX + authValue;
    }


    public List<Tweet> getTweets(String hashTag, Date since) throws UnirestException, ParseException {
        TweetsSource tweetsSource = new TweetsSource(hashTag);
        List<Tweet> tweets = tweetsSource.getTweets();
        while (tweetsSource.hasNewTweets && tweetsSource.getLastTweet().getDate().after(since)) {
            tweets.addAll(tweetsSource.getTweets());
        }
        return tweets.stream()
                .filter(tweet -> tweet.getDate().after(since))
                .collect(Collectors.toList());
    }

    private class TweetsSource {
        private final String hashTag;
        private Tweet lastTweet;
        private boolean hasNewTweets = true;

        public TweetsSource(String hashTag) {
            this.hashTag = hashTag;
        }

        public List<Tweet> getTweets() throws UnirestException, ParseException {
            HttpRequest request = Unirest.get(searchApiUrl)
                    .queryString("q", HASHTAG_PREFIX + hashTag)
                    .queryString("result_type", "recent")
                    .queryString("count", "100")
                    .header("Authorization", authValue);
            if (lastTweet != null) {
                request.queryString("max_id", lastTweet.getId());
            }
            List<Tweet> tweets = ResponseParser.parse(request.asJson().getBody());
            if (!tweets.isEmpty()) {
                lastTweet = tweets.get(tweets.size() - 1);
            }
            hasNewTweets = tweets.isEmpty();
            return tweets;
        }
        public Tweet getLastTweet() {
            return lastTweet;
        }
    }
}