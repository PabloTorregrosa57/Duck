package Weapon;

import Weapon.Behavior.KnifeBehavior;

/**
 *
 * @author Pablo
 */
public class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("Soy la reinita");
    }

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

}
