package Weapon;

import Weapon.Behavior.AxeBehavior;

/**
 *
 * @author Pablo
 */
public class Weapon {

    public static void main(String[] args) {
        Character king = new King();
        Queen queen = new Queen();
        king.fight();
        king.performWeapon();
        queen.fight();
        queen.performWeapon();
        queen.setWeapon(new AxeBehavior());
        queen.performWeapon();
    }
}
