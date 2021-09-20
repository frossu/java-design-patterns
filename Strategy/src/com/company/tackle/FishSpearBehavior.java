package com.company.tackle;

import com.company.FishingTackleBehavior;

public class FishSpearBehavior implements FishingTackleBehavior {
    @Override
    public void tryToCatch() {
        System.out.println("Catching with a spear");
    }
}
