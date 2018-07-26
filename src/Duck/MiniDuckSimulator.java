package Duck;

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
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
    
}
