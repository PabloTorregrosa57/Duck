package decorators.beverages;

import decorators.Beverage;

/**
 *
 * @author Pablo
 */
public class HouseBlend extends Beverage {

    public HouseBlend() { 
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
    
}
