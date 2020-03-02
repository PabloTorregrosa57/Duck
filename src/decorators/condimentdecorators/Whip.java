package decorators.condimentdecorators;

import decorators.Beverage;
import decorators.CondimentDecorator;

/**
 *
 * @author Pablo
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
    
}
