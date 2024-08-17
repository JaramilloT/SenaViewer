package edu.misena.senaviewer.model;

import java.util.Date;

public class Movie {
    public String id;
    public String title;
    public String genre;
    public String creator;
    public String duration;
    public Date year;
    public int viewed;
    public int timeViewed;



    public Movie(String title,String genre, String creator, String duration, Date year){
        this.title =title;
        this.genre =genre;
        this.creator =creator;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getCreator() {
        return creator;
    }


    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setYear(Date year) {
        this.year = year;
    }
}
