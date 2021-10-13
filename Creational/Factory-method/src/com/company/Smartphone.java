package com.company;

public class Smartphone implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on smartphone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off smartphone");
    }
}
