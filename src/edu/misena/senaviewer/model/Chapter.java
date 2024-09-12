package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapter {
    public String id;
    public static String title;
    public static String duration;
    public static int year;
    public int viewed;
    public int timeViewed;
    public int sessionNumber;


    public Chapter(String title, String duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public static String getTitle() {
        return title;
    }
    public static String getDuration() {
        return duration;
    }
    public static int getYear() {
        return year;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                ", sessionNumber=" + sessionNumber +
                '}';
    }
}
