package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine extends Publication{
    public String id;
    public static String title;
    public static String editionDate;
    public static String editorial;
    public String authors;

    public Magazine(String title,String editionDate, String editorial) {
        super(title, editionDate, editorial);
    }
/**
    public Magazine(String title,String editionDate, String editorial){
        this.title =title;
        this.editionDate =editionDate;
        this.editorial = editorial;
    }
 **/
    public static String getTitle() {
        return title;
    }
    public static String getEditionDate() {
        return editionDate;
    }
    public static String getEditorial() {
        return editorial;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id='" + id + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}
