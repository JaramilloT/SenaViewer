package edu.misena.senaviewer.model;

import java.util.Date;

public class Chapter {
    public String id;
    public String title;
    public String duration;
    public Date year;
    public int viewed;
    public int timeViewed;
    public int sessionNumber;


    public Chapter(String title,String duration, Date year){
        this.title =title;
        this.duration =duration;
        this.year =year;
    }

    public String getTitle() {
        return title;
    }
    public String getDuration() {
        return duration;
    }


    public void setYear(Date year) {
        this.year = year;
    }
}
