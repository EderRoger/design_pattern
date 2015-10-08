package observer;

import org.junit.Test;

/**
 * Created by eder on 02/10/15.
 */
public class ObserverTest {

    @Test
    public void testDisplayConditions(){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }

}
