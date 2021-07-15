package AnimalsInZoo;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot");
        Crocodile crocodile = new Crocodile("Crocodile");
        Mammal mammal = new Mammal("Koala");

        System.out.println("A " + bird.getAnimalName() + " is breeding by " + bird.breed());
        System.out.println("A " + crocodile.getAnimalName() + " is breeding by " + crocodile.breed());
        System.out.println("A " + mammal.getAnimalName() + " is breeding by " + mammal.breed());
    }
}
