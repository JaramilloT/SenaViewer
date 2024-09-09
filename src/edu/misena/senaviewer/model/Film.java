package edu.misena.senaviewer.model;

public class Film {
    public String id;
    public static String title;
    public static String genre;
    public static String creator;
    public static String duration;
    public static int year;
    public int viewed;

    public Film(String title, String genre, String creator, String duration){
        this.title =title;
        this.genre =genre;
        this.creator =creator;
        this.duration = duration;
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

    public void setId(String id) {
        this.id = id;
    }
    public void sedTitle(String title) {
        this.title = title;
    }

}
