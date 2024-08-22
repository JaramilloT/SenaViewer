package edu.misena.senaviewer.model;

public class Book {
    public String id;
    public static String title;
    public static String editionDate;
    public static String editorial;
    public  String authors;
    public static String isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title, String editionDate, String editorial, String isbn){
        this.title =title;
        this.editionDate =editionDate;
        this.editorial =editorial;
        this.isbn =isbn;
    }

    public static String getTitle() {
        return title;
    }
    public static String getEditionDate() {
        return editionDate;
    }
    public static String getEditorial() {
        return editorial;
    }
    public static String getIsbn() {
        return isbn;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
