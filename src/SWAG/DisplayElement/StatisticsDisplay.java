package SWAG.DisplayElement;

import SWAG.Observer;
import SWAG.Subject;
import static java.lang.Float.sum;
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (avgTemperature != 0) {
            this.avgTemperature = sum(avgTemperature, temperature) / 2;
            this.maxTemperature = max(avgTemperature, temperature);
            this.minTemperature = min(avgTemperature, temperature);
        } else {
            this.avgTemperature = temperature;
            this.maxTemperature = temperature;
            this.minTemperature = temperature;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature:" + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
