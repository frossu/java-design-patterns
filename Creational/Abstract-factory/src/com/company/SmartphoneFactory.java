package com.company;

public class SmartphoneFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        return new Smartphone();
    }

    @Override
    public OperatingSystemEnum getOSImage() {
        return OperatingSystemEnum.IOS;
    }
}
