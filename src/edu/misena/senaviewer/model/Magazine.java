package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {
    public String id;
    public static String title;
    public static String edititionDate;
    public static String editorial;
    public String authors;


    public Magazine(String title,String edititionDate, String editorial){
        this.title =title;
        this.edititionDate =edititionDate;
        this.editorial = editorial;
    }

    public static String getTitle() {
        return title;
    }
    public static String getEditionDate() {
        return edititionDate;
    }
    public static String getEditorial() {
        return editorial;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
