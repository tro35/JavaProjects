package farm;

import animal.Animal;

public class Main {
    public static void main(String[] args) {
        Farm farma = new Farm();

        Animal cow1 = new Animal("Cow1", 10, 10);
        Animal cow2 = new Animal("Cow2", 10, 10);


        farma.addAnimal(cow1);
        farma.addAnimal(cow2);
        cow1.Play();
        farma.breed();
        farma.breed();
        farma.breed();
        farma.breed();
        cow2.Eat();
        farma.slaughter();

        System.out.println(farma);
    }
}

