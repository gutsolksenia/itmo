package twitter.rest;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.text.ParseException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by ksenia on 22.09.17.
 */
public class TweetsCounterImpl implements TweetsCounter {
    private final RESTReader restReader;

    public TweetsCounterImpl(RESTReader restReader) {
        this.restReader = restReader;
    }

    @Override
    public List<Long> countTweets(String hashTag, Date since) throws ParseException, UnirestException {
        List<Tweet> tweets = restReader.getTweets(hashTag, since);
        Date now = new Date(System.currentTimeMillis());
        Map<Long, Long> hourToTweetsCount = tweets.stream().collect(
                Collectors.groupingBy(tweet -> differenceInHours(tweet.getDate(), now),
                Collectors.counting()));
        List<Long> tweetCounts = new ArrayList<>();
        Optional<Long> maxHourOpt = hourToTweetsCount.keySet().stream().max(Long::compare);
        maxHourOpt.ifPresent((Long maxHour) -> {
                for (long i = 0; i <= maxHour; i++) {
                    Long tweetCount = hourToTweetsCount.get(i);
                    if (tweetCount != null) {
                        tweetCounts.add(tweetCount);
                    } else {
                        tweetCounts.add(Long.valueOf(0));
                    }
                }
        });
        return tweetCounts;
    }

    private static long differenceInHours(Date from, Date to) {
        return TimeUnit.MILLISECONDS.toHours(to.getTime() - from.getTime());
    }
}