package postit;

public class PostIt {
        public String backgroundColor;
        public String text;
        public String textColor;

    @Override
    public String toString() {
        return "PostIt{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
