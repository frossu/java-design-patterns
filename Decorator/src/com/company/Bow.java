package com.company;

public class Bow extends Weapon {
    public Bow(int damage) {
        super(damage);
    }

    @Override
    public String performAttack() {
        return "Shoot an arrow and dealt " + getDamage() + " damage.";
    }
}
