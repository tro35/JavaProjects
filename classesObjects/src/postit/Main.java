package postit;

public class Main {
    public static void main(String[] args) {
        PostIt postIt = new PostIt();
        PostIt postIt1 = new PostIt();
        PostIt postIt2 = new PostIt();

        postIt.backgroundColor = "orange";
        postIt.text = "Idea 1";
        postIt.textColor = "blue";

        postIt1.backgroundColor = "pink";
        postIt1.text = "Awesome";
        postIt1.textColor = "black";

        postIt2.backgroundColor = "yellow";
        postIt2.text = "Superb";
        postIt2.textColor = "green";

        System.out.println("\n" + postIt + "\n" + postIt1 + "\n" + postIt2);
            }
}
