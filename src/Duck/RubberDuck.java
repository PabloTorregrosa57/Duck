package Duck;

import Duck.Behavior.FlyBehavior.FlyNoWay;
import Duck.Behavior.QuackBehavior.Sqeak;

/**
 * Patito de hule
 *
 * @author Pablo
 *
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Soy un Patito de Hule");
    }

    public RubberDuck() {
        quackBehavior = new Sqeak();
        flyBehavior = new FlyNoWay();

    }
}
