package Weapon;

import Weapon.Behavior.WeaponBehavior;

/**
 *
 * @author Pablo
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public Character() {
    }

    public void performWeapon() {
        weaponBehavior.weapon();

    }
    public void setWeapon(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

}
