
package SWAG.DisplayElement;

import SWAG.Observer;
import SWAG.Subject;

/**
 *
 * @author Pablo
 */
public class HeatIndexDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private Subject weatherData;
    private float heatIndex;
    
    public HeatIndexDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity=humidity;
        heatIndex = calculateHeatIndex ( temperature, humidity );
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat Index: " + heatIndex);
    }
    
     private float calculateHeatIndex ( float currentTemp, float currentHumidity ) {
        //Setting parameters for Function
        float temperature = currentTemp;
        float humidity = currentHumidity;
        float answer;
        final float C1 = (float) 16.923;
        final float C2 = (float) (1.85212E-1);
        final float C3 = (float) 5.37941;
        final float C4 = (float) (-1.0254E-1);
        final float C5 = (float) (9.41695E-3);
        final float C6 = (float) (7.28898E-3);
        final float C7 = (float) (3.45372E-4);
        final float C8 = (float) (-814971E-4);
        final float C9 = (float) (1.02102E-5);
        final float C10 = (float) (-3.8646E-5);
        final float C11 = (float) (2.91583E-5);
        final float C12 = (float) (1.42721E-6);
        final float C13 = (float) (1.97483E-7);
        final float C14 = (float) (-2.18429E-8);
        final float C15 = (float) (8.43296E-10);
        final float C16 = (float) (-4.1975E-11);
        float T = temperature;
        float R = humidity;
        float T2 = temperature * temperature;
        float R2 = humidity * humidity;
        float T3 = T2 * temperature;
        float R3 = R2 * humidity;

        //Function of Calculating Heat Index
        answer = C1 + (C2 * T) + (C3 * R) + (C4 * T * R) + (C5 * T2) + (C6 * R2) + (C7 * T2 * R) + (C8 * T * R2) + (C9 * T2 * R2)+ (C10 * T3)+ (C11 * R3)+ (C12 * T3 * R)
                + (C13 * T * R3)+ (C14 * T3 * R2)+ (C15 * T2 * R3)+ (C16 * T3 * R3);

        return answer;
        }
}
