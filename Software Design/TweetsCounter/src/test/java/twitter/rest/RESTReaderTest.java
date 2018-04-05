package twitter.rest;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.xebialabs.restito.server.StubServer;
import org.glassfish.grizzly.http.util.HttpStatus;
import org.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.xebialabs.restito.builder.stub.StubHttp.whenHttp;
import static com.xebialabs.restito.semantics.Action.status;
import static com.xebialabs.restito.semantics.Action.stringContent;
import static com.xebialabs.restito.semantics.Condition.alwaysTrue;
import static com.xebialabs.restito.semantics.Condition.not;
import static com.xebialabs.restito.semantics.Condition.parameter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


/**
 * Created by ksenia on 30.09.17.
 */
public class RESTReaderTest {

    private static final int PORT = 20362;
    private static final String SEARCH_URL = "http://localhost:" + PORT;
    private StubServer stubServer;
    private TweetsSource tweetsSource = new TweetsSource();

    @Before
    public void startStubServer() {
        stubServer = new StubServer(PORT);
        stubServer.start();
    }

    @After
    public void stopStubServer() {
        stubServer.stop();
    }

    @Test
    public void getTweetsTest() {
        Tweet tweet1 = tweetsSource.getTweet("30", 2);
        whenHttp(stubServer).match(not(parameter("max_id", "30")))
                .then(stringContent(tweetsSource.tweetsToString(tweet1)));
        whenHttp(stubServer).match(parameter("max_id", "30"))
                .then(stringContent(tweetsSource.tweetsToString()));
        RESTReader restReader = new RESTReader(SEARCH_URL, "auth");

        List<Tweet> result = null;
        try {
            Date date = new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(15));
            result = restReader.getTweets("hey", date);
        } catch (Exception e) {
            fail("Should not throw any exceptions");
            e.printStackTrace();
        }
        assertEquals(Collections.singletonList(tweet1), result);
    }

    @Test
    public void testNoConnection() {
        try {
            whenHttp(stubServer).match(alwaysTrue())
                    .then(status(HttpStatus.NOT_FOUND_404));
            RESTReader restReader = new RESTReader(SEARCH_URL, "auth");
            Date date = new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(3));
            restReader.getTweets("hey", date);
            fail();
        } catch (JSONException ex) {
        } catch (ParseException e) {
            fail("Should not throw ParseException");
            e.printStackTrace();
        } catch (UnirestException e) {
            fail("Should not throw UnirestException");
            e.printStackTrace();
        }
    }
}