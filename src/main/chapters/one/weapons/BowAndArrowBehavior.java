package main.chapters.one.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Hit by Bow And Arrow!");
    }
}
