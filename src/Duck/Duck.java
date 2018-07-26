package Duck;

import Duck.Behavior.QuackBehavior.QuackBehavior;
import Duck.Behavior.FlyBehavior.FlyBehavior;

/**
 *
 * @author Pablo
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // more
    public Duck() {
    }

    public abstract void display();
        
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swin() {
        System.out.println("All ducks float, even decoys!");
    }
    
}
