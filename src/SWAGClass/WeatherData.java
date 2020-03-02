/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWAGClass;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Pablo
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
    }
      
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        
        // Other WeatherData methods here
    }
    
}
