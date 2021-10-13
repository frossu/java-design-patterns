package com.company;

public class ConcreteCharacter {
    private Weapon weapon;

    public ConcreteCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("Hunter attacks.");
        System.out.println(weapon.performAttack());
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
