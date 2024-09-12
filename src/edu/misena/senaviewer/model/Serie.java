package edu.misena.senaviewer.model;
import java.util.Date;

public class Serie extends  Film{
    public String id;
        //public static String title;
        //public static String genre;
    public static String creator;
        //public static String duration;
    public static int year;
    public int viewed;
    public int timeViewed;
    public int sessionQuantity;


    public Serie(String title, String genre, String creator, String duration){
        super(title, genre, creator, duration);
    }


/**
    public Serie(String title,String genre, String duration){
        this.title =title;
        this.genre =genre;
        this.duration = duration;
    }
**/
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




    public void setTitle (String title){
        this.title = title;
    }
    public void setGenre (String genre){
        this.genre = genre;
    }
    public void setCreator (String creator){
        this.creator = creator;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id='" + id + '\'' +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                '}';
    }
}

