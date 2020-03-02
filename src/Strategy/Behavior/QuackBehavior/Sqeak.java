package Strategy.Behavior.QuackBehavior;

/**
 * Pito que suena como pato
 *
 * @author Pablo
 */
public class Sqeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Pito como si fuera un pato");
    }

}
