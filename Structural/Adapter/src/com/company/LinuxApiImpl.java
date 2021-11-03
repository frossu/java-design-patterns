package com.company;

class LinuxApiImpl implements LinuxApi {
    @Override
    public void malloc() {
        System.out.println("memory allocation in linux");
    }

    @Override
    public void createConnection() {
        System.out.println("network access in linux");
    }
}
