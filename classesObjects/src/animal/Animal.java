package animal;

public class Animal {
    String name;
    int hunger;
    int thirst;


    public Animal(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int hunger() {
        return hunger;
    }

    public void Eat() {
        this.hunger -= 10;
    }

    public void Drink() {
        this.thirst -= 10;
    }

    public void Play() {
        this.hunger += 10;
        this.thirst += 10;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}
