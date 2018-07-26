package Duck.Behavior.FlyBehavior;

/**
 * No vuela
 *
 * @author Pablo
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("No hago nada, No puedo volar");
    }
}
