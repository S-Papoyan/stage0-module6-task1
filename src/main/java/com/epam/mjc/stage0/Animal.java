package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }


    public String getDescription() {
        Animal animal = new Animal(color, numberOfPaws, hasFur);
        String s = !animal.hasFur ? "no" : "a";
        if (animal.numberOfPaws > 1) {
            return "This animal is mostly " + animal.color + ". It has " + animal.numberOfPaws + " paws and " +
                    s + " fur.";
        }
        return "This animal is mostly " + animal.color + ". It has " + animal.numberOfPaws + " paw and " +
                s + " fur.";
    }
}