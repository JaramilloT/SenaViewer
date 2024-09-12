package edu.misena.senaviewer.model;

public class Book extends Publication{
    public String id;
    public static String title;
    public static String editionDate;
    public static String editorial;
    public  String authors;
    public static int isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title,String editionDate, String editorial, int isbn) {
        super (title, editionDate, editorial);
        this.isbn = isbn;
    }
    /**
    public Book(String title, String editionDate, String editorial, int isbn){
        this.title =title;
        this.editionDate =editionDate;
        this.editorial =editorial;
        this.isbn =isbn;
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
    public static int getIsbn() {
        return isbn;
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
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", authors='" + authors + '\'' +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}
