package com.company;

public abstract class Weapon {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public abstract String performAttack();

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
