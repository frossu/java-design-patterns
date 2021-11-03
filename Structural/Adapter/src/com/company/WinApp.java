package com.company;

public class WinApp {

    private final WinApi winApi;

    public WinApp(WinApi winAPI) {
        this.winApi = winAPI;
    }

    public void start() {
        System.out.print("call win api memory allocation: ");
        winApi.allocateMemory();
        System.out.print("call win api network access: ");
        winApi.accessNetwork();
    }
}
