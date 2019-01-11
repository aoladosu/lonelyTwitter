package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class sad extends currentMood {

    final static String mood = "Sad";

    public sad(){
        // default date is current date
        setDate(new Date());
    }

    public sad(Date date){
        // takes a date argument
        setDate(date);
    }

    public String toString() {
        // return mood string
        return mood;
    }
}
