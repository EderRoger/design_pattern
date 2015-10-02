package observer;

/**
 * Created by eder on 02/10/15.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    public float tempeture;
    private float humidity;
    private Subject wheaterData;

    public CurrentConditionsDisplay(Subject wheaterData) {
        this.wheaterData = wheaterData;
        wheaterData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempeture = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + tempeture + " F degrees and " + humidity + " % humidity");
    }

}
