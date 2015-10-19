package command;

/**
 * Created by eder on 19/10/15.
 */
public class CeilingFan {
    public static final int HIGHT = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void hight(){
        speed = HIGHT;
        System.out.println("HIGHT Speed");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("MEDIUM Speed");
    }

    public void low(){
        speed = LOW;
        System.out.println("LOW Speed");
    }

    public void off(){
        speed = OFF;
        System.out.println("OFF");
    }

    public int getSpeed(){
        return speed;
    }
}
