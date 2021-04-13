package main.chapters.one.weapons;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Hit by Axe");
    }
}
