package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{
    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
    }

    public Violin() {
        super("Violin", 4);
    }

    @Override
    public String sound(){
        String soundType = "Screech";
        return soundType;
    }
}
