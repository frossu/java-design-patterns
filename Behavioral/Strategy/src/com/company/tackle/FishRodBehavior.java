package com.company.tackle;

import com.company.FishingTackleBehavior;

public class FishRodBehavior implements FishingTackleBehavior {
    @Override
    public void tryToCatch() {
        System.out.println("Catching with a fishing rod");
    }
}
