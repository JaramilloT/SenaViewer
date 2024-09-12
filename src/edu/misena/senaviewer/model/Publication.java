package edu.misena.senaviewer.model;

public class Publication {
        public static String title;
        public static String editionDate;
        public static String editorial;
        public static String authors;

        public Publication (String title, String editionDate, String editorial){
            this.title = title;
            this.editionDate = editionDate;
            this.editorial = editorial;
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
        return "Publication{}";
    }
}
