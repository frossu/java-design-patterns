package com.company;

public abstract class Character {

    private int money; // exchange for better tools
    private FishingTackleBehavior fishingTackleBehavior;

    public Character(FishingTackleBehavior fishingTackleBehavior) {
        this.fishingTackleBehavior = fishingTackleBehavior; // injecting dependency
    }
    public Character(int money, FishingTackleBehavior fishingTackleBehavior) {
        this.money = money;
        this.fishingTackleBehavior = fishingTackleBehavior;
    }

    public abstract void info();

    public void performCatch() {
        fishingTackleBehavior.tryToCatch();
    }

    public void setFishingRodBehavior(FishingTackleBehavior fishingTackleBehavior) {
        this.fishingTackleBehavior = fishingTackleBehavior;
    }
}
