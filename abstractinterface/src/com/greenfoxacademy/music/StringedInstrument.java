package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument{
    protected int numberOfStrings;


    public StringedInstrument(String instrumentName, int numberOfStrings) {
        super(instrumentName);
        this.numberOfStrings = numberOfStrings;
    }

    abstract public String sound();

    public void play(){
        System.out.println(this.instrumentName + ", a " + this.numberOfStrings + "- stringed instrument that goes " + this.sound() + "."  );
    }
}
