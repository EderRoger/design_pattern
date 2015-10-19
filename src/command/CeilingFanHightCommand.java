package command;

/**
 * Created by eder on 19/10/15.
 */
public class CeilingFanHightCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHightCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.hight();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGHT){
            ceilingFan.hight();
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
