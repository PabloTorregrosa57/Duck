package Strategy;

import Strategy.Behavior.FlyBehavior.FlyWhithWhings;
import Strategy.Behavior.QuackBehavior.Quack;

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
