package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public abstract class currentMood {

    private Date date;

    public Date getDate() {
        // return date
        return date;
    }

    public void setDate(Date date) {
        // set date
        this.date = date;
    }

    public abstract String toString();
}
