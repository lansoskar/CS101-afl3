import java.util.ArrayList;

public class RedditFrontPage {
    ArrayList<RedditPost>frontpage = new ArrayList<>();

    public void deletePost(int i){
        frontpage.remove(frontpage.get(i));
    }
}
