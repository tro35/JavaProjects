package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 50, 50);

        animal.Drink();
        animal.Eat();

        System.out.println(animal);

        animal.Play();

        System.out.println(animal);
    }
}
