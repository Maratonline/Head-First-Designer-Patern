package main.chapters.one;

import main.chapters.one.weapons.WeaponBehavior;

public class King extends Character {
    public King(){

    }
    public King(WeaponBehavior weaponBehavior){
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        if (super.weaponBehavior != null)
        super.weaponBehavior.useWeapon();
    }
}
