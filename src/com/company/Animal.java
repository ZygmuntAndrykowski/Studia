package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") weight = 20.0;
        else if (species == "Dragon") ;
        else weight = 1.0;


    }

    void feed() {
        weight++;
        System.out.println("Thx, I be so hungry, my weight is now " + weight);
    }
}
