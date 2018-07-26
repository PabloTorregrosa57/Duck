package Duck.Behavior.QuackBehavior;

/**
 * Ningùn sonido
 *
 * @author Pablo
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("No sueno");
    }
}
