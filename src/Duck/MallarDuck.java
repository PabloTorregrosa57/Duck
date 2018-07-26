package Duck;

import Duck.Behavior.FlyBehavior.FlyWhithWhings;
import Duck.Behavior.QuackBehavior.Quack;

/**
 * Este es un pato que vuela y flota
 *
 * @author Pablo
 */
public class MallarDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Soy un pato Mallar");
    }

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWhithWhings();
    }

}
