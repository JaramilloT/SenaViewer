package edu.misena.senaviewer.model;

import java.util.Date;

public class Serie {
    public String id;
    public static String title;
    public static String genre;
    public String creator;
    public static String duration;
    public Date year;
    public int viewed;
    public int timeViewed;
    public int sessionQuantity;



    public Serie(String title,String genre, String duration){
        this.title =title;
        this.genre =genre;
        this.duration = duration;
    }

    public static String getTitle() {
        return title;
    }
    public static String getGenre() {
        return genre;
    }
    public static String getDuration() {
        return duration;
    }



    public  void setDuration(String duration) {
        this.duration = duration;

    }
}

