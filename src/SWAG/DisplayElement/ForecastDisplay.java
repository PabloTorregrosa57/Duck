package SWAG.DisplayElement;

import SWAG.Observer;
import SWAG.Subject;
import SWAG.WeatherData;

/**
 *
 * @author Pablo
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    public String forecastTemp;
    public String forecastHumidity;
    public String forecast = "";
    public String forecastToday = "";
    public Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
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
         
    this.temperature  = temperature;
    this.humidity  = humidity;
    this.pressure  = pressure;
    display();

    }

    @Override
    public void display() {
        System.out.println("Forecast:" + forecastToday);
    }
}
