package teacherandstudents;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        t.teach(s);
        s.question(t);

    }
}