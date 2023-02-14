import java.text.SimpleDateFormat;
import java.util.Date;

public class RedditPost {
    private Date date;
    private String author;
    private int votes;
    private String title;

    public RedditPost(String author, String title) {
        this.author = author;
        this.title = title;
        this.votes = 1;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public int getVotes() {
        return votes;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
