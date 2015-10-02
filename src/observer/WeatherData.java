package observer;

import java.util.Observable;

/**
 * Created by eder on 02/10/15.
 */
public class WeatherData extends Observable {

    private float tempeture;
    private float humidity;
    private float pressure;

    public void setMeasurements(float tempeture, float humidity, float pressure){
        this.tempeture = tempeture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTempeture() {
        return tempeture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
