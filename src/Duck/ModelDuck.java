package Duck;

import Duck.Behavior.FlyBehavior.FlyNoWay;
import Duck.Behavior.QuackBehavior.Quack;

/**
 * Modelo de Pato
 *
 * @author Pablo
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm un modelo de pato");
    }

}
