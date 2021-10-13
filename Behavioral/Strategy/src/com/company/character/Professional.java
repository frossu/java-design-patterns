package com.company.character;

import com.company.Character;
import com.company.tackle.FishSpearBehavior;

public class Professional extends Character {
    public Professional() {
        super(new FishSpearBehavior());
    }

    @Override
    public void info() {
        System.out.println("I am so good at fishing");
    }
}
