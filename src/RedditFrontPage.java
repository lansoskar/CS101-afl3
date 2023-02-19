import java.util.ArrayList;

public class RedditFrontPage<RedditPost> { // opg f
    public ArrayList<RedditPost>frontpage = new ArrayList<>(){};

    public static void deletePost(ArrayList<?> list, int i){
        list.remove(i); // tager arraylist af hvilken som helst type og index på item der skal fjernes
    }
}
