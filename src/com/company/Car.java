package com.company;

import java.io.File;

public class Car {

    final String model;
    final String producer;
    final Integer year;
    String color;
    File pic;


    public Car(String model, String producer, Integer year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
    }


}