package main.chapters.one;

import main.chapters.one.weapons.WeaponBehavior;

public class Troll extends Character {
    public Troll(){

    }
    public Troll(WeaponBehavior weaponBehavior){
        super(weaponBehavior);
    }
    @Override
    public void fight() {
        if (super.weaponBehavior != null)
            super.weaponBehavior.useWeapon();
    }
}
