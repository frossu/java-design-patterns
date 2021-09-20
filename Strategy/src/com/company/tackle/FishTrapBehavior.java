package com.company.tackle;

import com.company.FishingTackleBehavior;

public class FishTrapBehavior implements FishingTackleBehavior {

    @Override
    public void tryToCatch() {
        System.out.println("Setting a trap");
    }
}
