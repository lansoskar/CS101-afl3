public class Article {
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
