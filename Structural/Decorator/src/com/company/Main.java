package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon sword = new CursedWeaponDecorator(new ForgedWeaponDecorator(new Sword(10)));
        Weapon bow = new ForgedWeaponDecorator(new ForgedWeaponDecorator(new Bow(15)));
        ConcreteCharacter character = new ConcreteCharacter(sword);
        character.attack();

        character.setWeapon(bow);
        character.attack();

        Weapon rlyCursedBow = new CursedWeaponDecorator(new CursedWeaponDecorator(new CursedWeaponDecorator(new Bow(10))));
        character.setWeapon(rlyCursedBow);
        character.attack();
    }
}
