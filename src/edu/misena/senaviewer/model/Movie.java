package edu.misena.senaviewer.model;

import java.util.Date;

public class Movie {
    public String id;
    public static String title;
    public static String genre;
    public static String creator;
    public static String duration;
    public static int year;
    public int viewed;
    public int timeViewed;



    public Movie(String title, String genre, String creator, String duration, int year){
        this.title =title;
        this.genre =genre;
        this.creator =creator;
        this.duration = duration;
        this.year = year;
    }

    public static String getTitle() {
        return title;
    }
    public static String getGenre() {
        return genre;
    }
    public static String getCreator() {
        return creator;
    }
    public static String getDuration() {
        return duration;
    }
    public static int getYear() {
        return year;
    }

/*
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setYear(Date year) {
        this.year = year;
    }

 */
}
