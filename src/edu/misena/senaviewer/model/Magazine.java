package edu.misena.senaviewer.model;

import java.util.Date;

public class Magazine {
    public String id;
    public String title;
    public String edititionDate;
    public String editorial;
    public String authors;


    public Magazine(String title,String edititionDate, String editorial){
        this.title =title;
        this.edititionDate =edititionDate;
        this.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }
    public String getEdititionDate() {
        return edititionDate;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
