package com.company;

public abstract class Device {

    OperatingSystemEnum operatingSystemEnum;

    abstract void turnOn();
    abstract void turnOff();
    void getOS() {
        System.out.println(operatingSystemEnum);
    }

    public void installOS(OperatingSystemEnum operatingSystemEnum) {
        this.operatingSystemEnum = operatingSystemEnum;
    }
}
