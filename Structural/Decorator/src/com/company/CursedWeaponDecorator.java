package com.company;

public class CursedWeaponDecorator extends WeaponDecorator {
    public CursedWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String performAttack() {
        return super.performAttack() + " Wielder received " + super.getDamage() / 2 + " damage.";
    }
}
