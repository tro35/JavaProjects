package farm;

import animal.Animal;


import java.util.ArrayList;
import java.util.List;

public class Farm {
    public List<Animal> animals = new ArrayList<>();
    private int animalSlots = 5;


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void breed() {
        if (animals.size() < animalSlots) {
            this.addAnimal(new Animal("breededanimal", 10, 10));
        } else {
            System.out.println("Farm is full");
        }
    }

    public void slaughter() {
        int animalPosition = 0;
        int hungerValue = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger() < hungerValue) {
                animalPosition = i;
                hungerValue = animals.get(i).hunger();
            }
        }
        animals.remove(animalPosition);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "animals=" + animals +
                ", animalSlots=" + animalSlots +
                '}';
    }
}
