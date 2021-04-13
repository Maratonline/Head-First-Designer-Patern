package main.chapters.one.weapons;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Hit by sword!");
    }
}
