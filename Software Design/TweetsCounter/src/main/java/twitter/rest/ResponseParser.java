package twitter.rest;

import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by ksenia on 30.09.17.
 */
public class ResponseParser {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yy", Locale.US);

    public static List<Tweet> parse(JsonNode responseBody) throws ParseException {
        List<Tweet> parsedTweets = new ArrayList<>();
        JSONArray unparsedTweets = responseBody.getObject().getJSONArray("statuses");
        for (int i = 0; i < unparsedTweets.length(); i++) {
            parsedTweets.add(parseTweet(unparsedTweets.getJSONObject(i)));
        }
        return parsedTweets;
    }

    private static Tweet parseTweet(JSONObject unparsedTweet) throws ParseException {
        String dateAsString = unparsedTweet.getString("created_at");
        Date date = DATE_FORMAT.parse(dateAsString);
        String id = unparsedTweet.getString("id_str");
        return new Tweet(id, date);
    }
}