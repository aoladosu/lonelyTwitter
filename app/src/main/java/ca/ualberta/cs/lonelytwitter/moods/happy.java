package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

public class happy extends currentMood {

    final static String mood = "Happy";

    public happy(){
        // default date is current date
        setDate(new Date());
    }

    public happy(Date date){
        // takes date argument
        setDate(date);
    }

    public String toString(){
        // return mood string
        return mood;
    }


}
