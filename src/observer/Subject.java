package observer;

/**
 * Created by eder on 02/10/15.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
