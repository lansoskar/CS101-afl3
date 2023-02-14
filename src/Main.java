import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
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
        }
    }
}

