package com.company;

public class Main {

    static DeviceFactory deviceFactory;

    public static void main(String[] args) {
        configure("laptop");
//        Device device = deviceFactory.createDevice();
//        OperatingSystemEnum operatingSystem = deviceFactory.getOSImage();
//        device.installOS(operatingSystem);
        Device device = deviceFactory.getConfiguredDevice();
        device.turnOn();
        device.getOS();
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
