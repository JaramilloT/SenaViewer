package edu.misena.senaviewer.model;

public class Book {
    public String id;
    public String title;
    public String editionDate;
    public String editorial;
    public String authors;
    public String isbn;
    public boolean readed;
    public int timeReaded;

    public Book(String title, String editionDate, String editorial, String isbn){
        this.title =title;
        this.editionDate =editionDate;
        this.editorial =editorial;
        this.isbn =isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getEditionDate() {
        return editionDate;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
