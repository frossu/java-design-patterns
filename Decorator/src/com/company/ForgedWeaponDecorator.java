package com.company;

public class ForgedWeaponDecorator extends WeaponDecorator {
    public ForgedWeaponDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String performAttack() {
        return super.performAttack() + " Dealt additional 2 damage.";
    }
}
