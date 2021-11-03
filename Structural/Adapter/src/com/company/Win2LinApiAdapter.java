package com.company;

public class Win2LinApiAdapter implements WinApi {

    public Win2LinApiAdapter(LinuxApi linuxApi) {
        this.linuxApi = linuxApi;
    }

    private LinuxApi linuxApi;

    @Override
    public void allocateMemory() {
        linuxApi.malloc();
    }

    @Override
    public void accessNetwork() {
        linuxApi.createConnection();
    }
}
