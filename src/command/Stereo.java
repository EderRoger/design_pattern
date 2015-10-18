package command;

/**
 * Created by eder on 17/10/15.
 */
public class Stereo {
    private final String description;
    private int volume;

    public Stereo(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd(){

    }

    public void setDvd(){

    }

    public void setRadio(){

    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
