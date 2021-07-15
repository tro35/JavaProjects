package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("red", (float) 50.6);
        Sharpie sharpie1 = new Sharpie("blue", (float) 100.1);

        sharpie.useSharpie();
        System.out.println(sharpie);

        System.out.println(sharpie1);
    }
}
