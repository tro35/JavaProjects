package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    @Override
    public String sound(){
        String soundType = "Twang";
        return soundType;
    }
}
