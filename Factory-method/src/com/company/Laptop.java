package com.company;

public class Laptop implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on laptop");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off laptop");
    }
}
