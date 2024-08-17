import java.util.Date;

public class Serie {
    public String id;
    public String title;
    public String genre;
    public String creator;
    public String duration;
    public Date year;
    public int viewed;
    public int timeViewed;
    public int sessionQuantity;



    public Serie(String title,String genre, String duration){
        this.title =title;
        this.genre =genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }


    public void setDuration(String duration) {
        this.duration = duration;
    }
}
