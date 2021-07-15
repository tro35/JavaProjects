package piratesapp;
import java.util.Random;
public class Dice {
    private Random rand;

    public Dice(){
        this.rand = new Random();
    }

    public int hod(){
        return rand.nextInt(30);
    }

    @Override
    public String toString() {
        return "dice=" + hod();
    }
}
