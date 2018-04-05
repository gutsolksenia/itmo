package twitter.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ksenia on 07.10.17.
 */
public class PropertiesHolder {
    public static final String SEARCH_API_URL;
    public static final String TWITTER_AUTH_VALUE;

    static  {
        Properties properties = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("config.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Properties were not loaded");
        }
        SEARCH_API_URL = properties.getProperty("search.api.url");
        TWITTER_AUTH_VALUE = properties.getProperty("auth.token");
    }
}
