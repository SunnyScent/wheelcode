package headfirst.pattern.command;

/**
 * @author: SunnyScent
 * @Date: 2016-11-17
 * @Time: 22:46
 */

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}