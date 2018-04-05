package twitter.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by ksenia on 30.09.17.
 */

@RunWith(MockitoJUnitRunner.class)
public class TweetsCounterImplTest {

    @Mock
    private RESTReader restReader;
    TweetsSource tweetsSource = new TweetsSource();

    @Test
    public void counterTest() {
        TweetsCounter tweetsCounter = new TweetsCounterImpl(restReader);
        List<Tweet> tweets = new ArrayList<>();
        int interval = 100;
        for (int i = 0; i < interval; i++) {
            for (int j = 0; j < i; j++) {
                tweets.add(tweetsSource.getTweet(i));
            }
        }
        try {
            when(restReader.getTweets(any(), any()))
                    .thenReturn(tweets);
            List<Long> countedTweets = tweetsCounter.countTweets("", new Date());
            for (int i = 0; i < interval; i++) {
                assertEquals(Long.valueOf(i), countedTweets.get(i));
            }
        } catch (Exception e) {
            fail("Should not throw any exceptions");
            e.printStackTrace();
        }
    }

    @Test
    public void simpleTest() {
        TweetsCounter tweetsCounter = new TweetsCounterImpl(restReader);
        List<Tweet> tweets = new ArrayList<>();
        int interval = 100;
        for (int i = 0; i < interval; i++) {
            tweets.add(tweetsSource.getTweet("#" + i, i));
        }
        try {
            when(restReader.getTweets(any(), any()))
                    .thenReturn(tweets);
            List<Long> countedTweets = tweetsCounter.countTweets("", new Date());
            for (int i = 0; i < interval; i++) {
                assertEquals(Long.valueOf(1), countedTweets.get(i));
            }
        } catch (Exception e) {
            fail("Should not throw any exceptions");
            e.printStackTrace();
        }

    }
}