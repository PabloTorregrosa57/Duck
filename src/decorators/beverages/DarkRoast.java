package decorators.beverages;

import decorators.Beverage;

/**
 *
 * @author Pablo
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }

}
