package SWAG;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pessure;
    
    public WeatherData(){
        observers = new ArrayList();
    }
      
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeOserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObsevers() {
        for (int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pessure);
        }
    }
    
    public void measurementsChanged(){
        notifyObsevers();
    }
    
    public void setMesurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pessure = pressure;
        measurementsChanged();
        
        // Other WeatherData methods here
    }
}
