public class UrlFixer {
  public static void main(String args[]) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    char ch = ':';
    url = url.replace("/", "\\");
    url = url.substring(0, 5) + ch + url.substring(5);

    if(url.contains("bots"))
    url = url.replace("bots", "odds");
    
    System.out.println(url);
  }
}