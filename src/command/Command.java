package command;

/**
 * Created by eder on 15/10/15.
 */
public interface Command {
    void execute();
    void undo();
}
