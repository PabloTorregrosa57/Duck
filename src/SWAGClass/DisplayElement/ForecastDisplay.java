package SWAGClass.DisplayElement;

/**
 *
 * @author Pablo
 */

import SWAG.DisplayElement.DisplayElement;
import SWAGClass.WeatherData;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    
    private float currentPressure = 29.92f;
    private float lastPressure;
    public String forecastToday = "";
    public String forecast = "";
    
    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
        WeatherData weatherData = (WeatherData)observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            lastPressure = currentPressure;
            currentPressure = ((WeatherData) observable).getPressure();
            forecastToday = calculaForecastToday(observable);
            display();
//            WeatherData wetherData = (WeatherData)observable;
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast:" + forecastToday);
    }

    private String calculaForecastToday(Observable observable) {
        String forecastTemp;
        String forecastHumidity;
        String forecastPressure;
        WeatherData weatherData = (WeatherData)observable;
    float temperature = weatherData.getTemperature();
    float humidity = weatherData.getHumidity();
    float pressure = weatherData.getPressure();

        if (temperature > 82.0F) {
            forecastTemp = "Weather Hot ";
        } else {
            if (temperature > 82.0F) {
                forecastTemp = "Improving weather on the way";
            } else {
                forecastTemp = "watch out for cooler";
            }
        }
        if (humidity < 50) {
            forecastHumidity = " and dry.";
        } else {
            if (humidity < 70) {
                forecastHumidity = "!";
            } else {
                forecastHumidity = ", rainy weather ";
            }
        }
        if (forecast.equals(forecastTemp.concat(forecastHumidity))) {
            forecastToday = "More of the same";
        } else {
            forecast = forecastTemp.concat(forecastHumidity);
            forecastToday = forecastTemp.concat(forecastHumidity);
        }
        return forecastTemp;
    }

}
