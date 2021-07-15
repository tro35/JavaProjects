package AnimalsInZoo;

public class Mammal extends Animal{
    public Mammal(String animalName) {
        super(animalName);
    }

    @Override
    public String breed(){
        String breedType = "pushing miniature versions out";
        return breedType;
    }
}
