package com.company;

import java.util.List;

public class Cook implements Observer {
    private String name;
    private List<String> dishesToCook;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> dishesToCook) {
        System.out.println(this.name + ": Changes in dishesToCook");
        this.dishesToCook = dishesToCook;
    }

    public void cook() {
        System.out.println("Cooking: " + dishesToCook.remove(0));
    }
}
