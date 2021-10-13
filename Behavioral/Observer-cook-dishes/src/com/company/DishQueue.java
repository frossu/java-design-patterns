package com.company;

import java.util.ArrayList;
import java.util.List;

public class DishQueue implements Observable {
    private List<Observer> cooks = new ArrayList<>();
    private List<String> dishesToCook = new ArrayList<>();

    void addDish(String dish) {
        dishesToCook.add(dish);
        notifyAllObservers();
    }

    void removeDish(String dish) {
        dishesToCook.remove(dish);
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer cook) {
        cooks.add(cook);
    }

    @Override
    public void unregisterObserver(Observer cook) {
        cooks.remove(cook);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer cook : cooks) {
            cook.update(dishesToCook);
        }
    }
}
