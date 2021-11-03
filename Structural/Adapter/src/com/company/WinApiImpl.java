package com.company;

public class WinApiImpl implements WinApi {

    @Override
    public void allocateMemory() {
        System.out.println("memory allocation in windows");
    }

    @Override
    public void accessNetwork() {
        System.out.println("network access in windows");
    }
}
