package SWAGClass.DisplayElement;

import SWAGClass.WeatherData;
import java.util.Observable;
import java.util.Observer;
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

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
        WeatherData weatherData = (WeatherData) observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature:" + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
        float temperature  = ((WeatherData)observable).getTemperature();
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
//            WeatherData wetherData = (WeatherData)observable;
        }
    }
}
