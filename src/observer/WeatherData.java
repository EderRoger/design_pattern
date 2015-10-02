package observer;

import java.util.ArrayList;

/**
 * Created by eder on 02/10/15.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float tempeture;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void setMeasurements(float tempeture, float humidity, float pressure){
        this.tempeture = tempeture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(tempeture, humidity, pressure);
        }
    }

}
