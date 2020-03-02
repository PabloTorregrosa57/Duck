package Strategy.Behavior.QuackBehavior;

/**
 * Quack es el sonido de pato
 *
 * @author Pablo
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

}
