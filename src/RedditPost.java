import java.text.SimpleDateFormat;
import java.util.Date;

public class RedditPost extends RedditFrontPage implements Comparable<RedditPost> { // opg e
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

    @Override
    public String toString() {
        return "RedditPost{" +
                "date=" + date +
                ", author='" + author + '\'' +
                ", votes=" + votes +
                ", title='" + title + '\'' +
                '}';
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

    @Override
    public int compareTo(RedditPost o) { // desc
        if (this.votes > o.votes) {
            return -1;
        } else if (this.votes == o.votes) {
            return 0;
        } else {
            return 1;
        }
    }

}
