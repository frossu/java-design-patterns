package com.company;

import com.company.character.Newbie;
import com.company.character.Professional;
import com.company.tackle.FishTrapBehavior;

public class Main {

    public static void main(String[] args) {
        Newbie newbie = new Newbie();
        Professional professional = new Professional();

        newbie.info();
        newbie.performCatch();
        professional.info();
        professional.performCatch();

        professional.setFishingRodBehavior(new FishTrapBehavior());
        professional.performCatch();
    }
}
