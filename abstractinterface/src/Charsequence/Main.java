package Charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirt gnirts = new Gnirt("example");
        System.out.println(gnirts.charAt(1));
        System.out.println(gnirts.subSequence(2, 4));

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
    }

}
