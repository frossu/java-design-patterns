package com.company;

public class Main {

    /**
     * A program written for Windows which makes calls to WinApi
     */
    public static void main(String[] args) {
        WinApp app = new WinApp(new WinApiImpl());
        app.start();

        System.out.println("\nrun the same application in linux");
        app = new WinApp(new Win2LinApiAdapter(new LinuxApiImpl())); // wine
        app.start();
    }
}
