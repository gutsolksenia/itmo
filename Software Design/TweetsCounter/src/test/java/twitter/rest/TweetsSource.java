package twitter.rest;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ksenia on 29.09.17.
 */
public class TweetsSource {
    private final long currentTimeInMillis = System.currentTimeMillis();

    public Tweet getTweet(int hoursAgo) {
        return new Tweet("#" + System.currentTimeMillis(), getTime(hoursAgo));
    }

    public Tweet getTweet(String id, int hoursAgo) {
        return new Tweet(id, getTime(hoursAgo));
    }

    private Date getTime(int hoursAgo) {
        return new Date(currentTimeInMillis - TimeUnit.HOURS.toMillis(hoursAgo));
    }

    public String tweetsToString(Tweet... tweets) {
        JSONObject jsonObject = new JSONObject();
        JSONArray statuses = new JSONArray();
        for (Tweet tweet: tweets) {
            statuses.put(tweetToJson(tweet));
        }
        jsonObject.put("statuses", statuses);
        return jsonObject.toString();
    }

    private static JSONObject tweetToJson(Tweet tweet) {
        return new JSONObject().put("id_str", tweet.getId())
                .put("created_at", tweet.getDate().toString());
    }
}
