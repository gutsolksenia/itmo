package twitter.rest;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by ksenia on 29.09.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        RESTReader restReader = new RESTReader(PropertiesHolder.SEARCH_API_URL,
                PropertiesHolder.TWITTER_AUTH_VALUE);
        TweetsCounter tweetsCounter = new TweetsCounterImpl(restReader);
        Date since = new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(6));
        try {
            tweetsCounter.countTweets("крым", since).forEach(count -> System.out.println(count));
            System.out.println();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}