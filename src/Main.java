import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
 /*       ArrayList<Article> articles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            RandomNum.randomNum();
        }
        CPRcheck.checkCPR();
        Article a = new Article("Rockerklub flyttede ind i nedlagt brugs: Nu er de sparket ud af byen ", "Anders Malling Beck");
        Article b = new Article("Efter massiv shitstorm: Unisport laver ny salgsrekord ", "Sebastian Frølich");
        Article c = new Article("Bilgigant varsler massefyringer ", "Anne Katrine Restrup");
        Article d = new Article("Slut med rygning i arbejdstiden: Endnu en kommune vil kvitte smøgerne ", "Sebastian Døssing");
        Article e = new Article("Musk har begrænset internettet i Ukraine: 'Er bange for, at det kan starte 3. verdenskrig' ", "Oliver Fruergaard");
        articles.add(a);
        articles.add(b);
        articles.add(c);
        articles.add(d);
        articles.add(e);
        for (Article x: articles) {
            System.out.println(x);
        }*/

        Square a = new Square(5,5);
        Square b = new Square(10, 10);

        a.compareTo(b);

        ArrayList<RedditPost>frontpage = new ArrayList<RedditPost>(); // samme some opg D
        RedditPost one = new RedditPost("Mogens", "caught this fish");
        RedditPost two = new RedditPost("Karl", "i hate my job");
        RedditPost three = new RedditPost("Johannes", "im gonna kick this child");
        RedditPost four = new RedditPost("Andreas", "2 months sober wow");
        frontpage.add(one);
        frontpage.add(two);
        frontpage.add(three);
        frontpage.add(four);
        one.setVotes(4);
        two.setVotes(12);
        three.setVotes(50);
        four.setVotes(1);
        Collections.sort(frontpage);
        System.out.println(frontpage);
        RedditFrontPage.deletePost(frontpage, 1);
        System.out.println(frontpage);






    }
}

