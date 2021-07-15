package blog;
import blogpost.BlogPost;
import java.util.List;
import java.util.ArrayList;

public class Blog {
    List<BlogPost> blogPosts = new ArrayList<>();

    public void addBlogPost(BlogPost blogPost){
        blogPosts.add(blogPost);
    }

    public void removePost(int index){
        blogPosts.remove(index);
    }

    public void updatePost(int index, BlogPost blogPost){
        blogPosts.set(index, blogPost);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogPosts=" + blogPosts +
                '}';
    }
}
