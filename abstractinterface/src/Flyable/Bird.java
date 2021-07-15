package Flyable;

import AnimalsInZoo.Animal;

public class Bird extends Animal implements Flyable{

    public String breed(){
        return "by eggs";
    }

    @Override
    public void land(){

    }

    @Override
    public void fly(){

    }
    @Override
    public void takeOff(){

    }
}
