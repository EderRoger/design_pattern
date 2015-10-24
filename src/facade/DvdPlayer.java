package facade;

/**
 * Created by eder on 24/10/15.
 */
public class DvdPlayer {
    public void on() {
        System.out.println("DVD on");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie " + movie);
    }

    public void stop() {
        System.out.println("DVD stop...");
    }

    public void eject() {
        System.out.println("DVD Eject..");
    }

    public void off() {
        System.out.println("DVD OFF");
    }
}
