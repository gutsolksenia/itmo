package twitter.rest;

import java.util.Date;

/**
 * Created by ksenia on 30.09.17.
 */
public class Tweet {
    private final String id;
    private final Date date;

    public Tweet(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Tweet)) {
            return false;
        }
        Tweet other = (Tweet) object;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}