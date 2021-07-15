package sharpie;

public class Sharpie {
    public String color;
    public float width;
    public float inkAmount;

    public Sharpie(String color, float inkAmount){
        this.color = color;
        this.width = 2;
        this.inkAmount = inkAmount;
    }

    public void useSharpie(){
        this.inkAmount -= 10;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }
}
