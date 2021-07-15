package blog;

import blogpost.BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost post1 = new BlogPost("Tomas", "Java programming", "book about programming", "130120");
        BlogPost post2 = new BlogPost("Amanda", "Cooking", "book about cooking", "150120");
        BlogPost post3 = new BlogPost("John", "Trip advisor", "book about travelling", "100120");

        Blog blog = new Blog();

        blog.addBlogPost(post1);
        blog.addBlogPost(post2);
        blog.addBlogPost(post3);

        System.out.println(blog);

        blog.updatePost(1, post3);

        System.out.println(blog);
    }
}
