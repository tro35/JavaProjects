package piratesapp;

public class Main {
    public static void main(String[] args) throws Exception {

        Pirate pirate1 = new Pirate("Jack Sparrow", 100);
        Pirate pirate2 = new Pirate("Jimmy", 100);
        Pirate testFight = new Pirate();
        Dice dice = new Dice();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();

        pirate1.howIsItGoingMate();
        System.out.println(pirate1);

        while (!testFight.brawl(pirate1, pirate2, dice.hod(), dice.hod())) {

        }
        testFight.writeWinner(pirate1, pirate2);

    }


}
