package SWAGClass;

import SWAGClass.DisplayElement.CurrentConditionsDisplay;
import SWAGClass.DisplayElement.ForecastDisplay;
import SWAGClass.DisplayElement.HeatIndexDisplay;
import SWAGClass.DisplayElement.StatisticsDisplay;
import java.util.Observable;

/**
 *
 * @author Pablo
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay((Observable) weatherData);
        StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay((Observable) weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay( weatherData);
                
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        
    }
    
}
