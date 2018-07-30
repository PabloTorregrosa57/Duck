package Weapon;

import Weapon.Behavior.AxeBehavior;

/**
 *
 * @author Pablo
 */
public class Troll extends Character {

    @Override
    public void fight() {
        System.out.println("Soy un Troll");
    }

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

}
