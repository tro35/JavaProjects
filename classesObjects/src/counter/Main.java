package counter;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();

        System.out.println(c.getValue());
        c.addNumber(20);
        c.add();
        System.out.println(c.getValue());
        c.reset();
        System.out.println(c.getValue());
    }
}
