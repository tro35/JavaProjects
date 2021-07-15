package blogpost;

public class BlogPost {
    public String authorName;
    public String title;
    public String text;
    public String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
