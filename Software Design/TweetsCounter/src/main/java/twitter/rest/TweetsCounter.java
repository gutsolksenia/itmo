package twitter.rest;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by ksenia on 22.09.17.
 */
public interface TweetsCounter {
    List<Long> countTweets(String hashTag, Date since) throws ParseException, UnirestException;
}