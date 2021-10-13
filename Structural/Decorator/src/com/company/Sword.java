package com.company;

public class Sword extends Weapon {
    public Sword(int damage) {
        super(damage);
    }

    @Override
    public String performAttack() {
        return "Dealt " + getDamage() + " damage with slashing attack.";
    }
}
