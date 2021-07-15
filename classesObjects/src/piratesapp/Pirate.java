package piratesapp;

public class Pirate {
    String name;
    int health;
    int attack;
    int rumAmount;

    public Pirate() {
    }

    public Pirate(String name, int health) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void drinkSomeRum() {
        this.rumAmount += 1;
    }

    public void howIsItGoingMate() {
        if (rumAmount <= 4) {
            System.out.println("Pour me annuder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public boolean brawl(Pirate pir1, Pirate pir2, int attack, int attack2) {
        pir1.health -= attack;
        pir2.health -= attack2;
        if (pir1.health <= 0 || pir2.health <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public void writeWinner(Pirate pir1, Pirate pir2){
        if(pir1.health <= pir2.health){
            System.out.println("I am winner! " + pir2.name);
        }
        else{
            System.out.println("I am winner! " + pir1.name);
        }
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", rumAmount=" + rumAmount +
                '}';
    }
}
