package com.greenfoxacademy.music;

public class Main {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.play();

        ElectricGuitar electricGuitar2 = new ElectricGuitar(7);
        electricGuitar2.play();

        Violin violin = new Violin();
        violin.play();

        BassGuitar bassGuitar = new BassGuitar();
        bassGuitar.play();

        BassGuitar bassGuitar1 = new BassGuitar(5);
        bassGuitar1.play();
    }
}
