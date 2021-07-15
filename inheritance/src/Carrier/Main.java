package Carrier;

public class Main {
    public static void main(String[] args) {
        F16 f16 = new F16();
        F35 f35 = new F35();
        f16.getStatus();
        f35.getStatus();
        f35.refill(300);
    }
}
