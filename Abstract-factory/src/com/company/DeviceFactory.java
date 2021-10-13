package com.company;

public abstract class DeviceFactory {

    Device getConfiguredDevice() {
        Device device = createDevice();
        OperatingSystemEnum OS = getOSImage();
        device.installOS(OS);
        return device;
    }

    abstract Device createDevice();
    abstract OperatingSystemEnum getOSImage();
}
