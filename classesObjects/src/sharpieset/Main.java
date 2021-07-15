package sharpieset;

import sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {
        SharpieSet allSharpies = new SharpieSet("Tomikuv set");
        Sharpie sharpie = new Sharpie("red", (float) 50.6);
        Sharpie  sharpie1 = new Sharpie("blue", (float) 100.1);
        Sharpie  sharpie2 = new Sharpie("green", (float) 0);

        allSharpies.addSharpie(sharpie);
        allSharpies.addSharpie(sharpie1);
        allSharpies.addSharpie(sharpie2);

        System.out.println(allSharpies);
        System.out.println(allSharpies.countUsable());
        allSharpies.removeTrash();
        System.out.println(allSharpies);
    }
}