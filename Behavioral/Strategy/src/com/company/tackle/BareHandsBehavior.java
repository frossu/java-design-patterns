package com.company.tackle;

import com.company.FishingTackleBehavior;

public class BareHandsBehavior implements FishingTackleBehavior {

    @Override
    public void tryToCatch() {
        System.out.println("I can't do it with my bare hands :(");
    }
}
