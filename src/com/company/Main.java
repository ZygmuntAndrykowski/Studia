package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Zygmunt";
        me.lastName = "Andrykowski";
        me.car = new Car("6", "Mazda", 2005);


        Animal dog = new Animal("Dog");
        dog.name = "Pies";

        System.out.println("Hi, I'm " + dog.name);
        System.out.println("My species is " + dog.species);
    }
}
