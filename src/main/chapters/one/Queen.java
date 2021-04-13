package main.chapters.one;

import main.chapters.one.weapons.WeaponBehavior;

public class Queen extends Character {
    public Queen(){

    }
    public Queen(WeaponBehavior weaponBehavior){
        super(weaponBehavior);
    }
    @Override
    public void fight() {
        if (super.weaponBehavior != null)
            super.weaponBehavior.useWeapon();
    }
}
