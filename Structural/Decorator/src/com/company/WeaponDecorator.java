package com.company;

public class WeaponDecorator extends Weapon {

    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        super(weapon.getDamage());
        this.weapon = weapon;
    }

    @Override
    public String performAttack() {
        return weapon.performAttack();
    }
}
