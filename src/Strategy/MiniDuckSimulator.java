package Strategy;

import Strategy.Behavior.FlyBehavior.FlyRocketPowered;

/**
 * Mini simulador de Patos
 * @author Pablo
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        Duck rubberDuck = new RubberDuck();
        mallarDuck.display();
        mallarDuck.swin();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        rubberDuck.display();
        rubberDuck.swin();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
