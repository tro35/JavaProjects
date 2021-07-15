package PrintableInterface;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (Domino domino : initializeDominoes()) {
            domino.printAllFields();
        }
    }
    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
