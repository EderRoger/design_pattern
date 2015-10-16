package command;

/**
 * Created by eder on 15/10/15.
 */
public class GarageDoor {

    Light light;

    public GarageDoor(Light light) {
        this.light = light;
    }

    public void up(){
        System.out.println("Door is up");
    }

    public void down(){
        System.out.println("door is down");
    }
    public void stop(){
        System.out.println("Door stopped");
    }

    public void lightOn(){
        light.on();
    }

    public void lightOff(){
        light.off();
    }

}
