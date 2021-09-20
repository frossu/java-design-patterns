package com.company.character;

import com.company.Character;
import com.company.tackle.FishRodBehavior;

public class Newbie extends Character {
    public Newbie() {
        super(new FishRodBehavior());
    }

    @Override
    public void info() {
        System.out.println("Got a fishing rod. Now, how do I catch?");
    }
}
