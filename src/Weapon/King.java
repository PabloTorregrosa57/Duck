package Weapon;

import Weapon.Behavior.SwordBehavior;

/**
 *
 * @author Pablo
 */
public class King extends Character {

    @Override
    public void fight() {
        System.out.println("Soy un rey");
    }

    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
