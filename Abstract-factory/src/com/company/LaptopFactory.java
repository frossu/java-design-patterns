package com.company;

public class LaptopFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        return new Laptop();
    }

    @Override
    public OperatingSystemEnum getOSImage() {
        return OperatingSystemEnum.Windows;
    }
}
