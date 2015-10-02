package observer;

import java.util.*;

/**
 * Created by eder on 02/10/15.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {

    Observable observable;
    public float tempeture;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.tempeture = weatherData.getTempeture();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + tempeture + " F degrees and " + humidity + " % humidity");
    }
}
