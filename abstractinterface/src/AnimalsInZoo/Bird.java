package AnimalsInZoo;

public class Bird extends Animal{
    public Bird(String animalName) {
        super(animalName);
    }
    @Override
    public String breed(){
        String breedType = "laying eggs";
        return breedType;
    }
}

