package Weapon;

import Weapon.Behavior.BowAndArrowBehavior;

/**
 *
 * @author Pablo
 */
public class Knight extends Character {

    @Override
    public void fight() {
        System.out.println("Soy un caballero");
    }

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

}
