package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Doggie";

        System.out.println("Hi, I'm " + dog.name);
        System.out.println("My species is " + dog.species);

        dog.feed();

        Human me = new Human();
        me.firstName = "Jakub";
        me.lastName = "Russian";
        me.pet = dog;

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Dragon");
        me.pet.name = "Mysz";


        System.out.println(me.pet.species);
    }
}
