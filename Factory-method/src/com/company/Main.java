package com.company;

public class Main {

    static DeviceFactory deviceFactory;

    public static void main(String[] args) {
        configure("laptop");
        Device device = deviceFactory.createDevice();

        device.turnOn();
        device.turnOff();
    }

    public static void configure(String f) {
        if (f.equals("laptop")) {
            deviceFactory = new LaptopFactory();
        } else {
            deviceFactory = new SmartphoneFactory();
        }
    }
}
