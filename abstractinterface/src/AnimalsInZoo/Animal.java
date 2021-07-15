package AnimalsInZoo;

abstract public class Animal {
    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(){

    }

    abstract public String breed();

    public String getAnimalName(){
        return this.animalName;
    }
}
