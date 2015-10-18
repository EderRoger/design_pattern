package command;

/**
 * Created by eder on 15/10/15.
 */
public class Light {
    private String description;

    public Light(String description) {
        this.description = description;
    }

    public void on(){
        System.out.println("Light's on");
    }

    public void off(){
        System.out.println("Light is off");
    }
}
