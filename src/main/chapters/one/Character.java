package main.chapters.one;

import main.chapters.one.weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character(){

    }
    public Character(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
        if (weaponBehavior != null)
            weaponBehavior.useWeapon();
    }
}
