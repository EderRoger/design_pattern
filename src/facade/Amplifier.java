package facade;

/**
 * Created by eder on 24/10/15.
 */
public class Amplifier {
    public void on() {
        System.out.println("Amp on");
    }

    public void setDvd(DvdPlayer dvd) {

    }

    public void setSurroundSound() {
        System.out.println("Set surround");
    }


    public void setVolume(int volume) {
        System.out.println("Volume increase in.. " + volume);
    }

    public void off() {
        System.out.println("Amp off");
    }
}
