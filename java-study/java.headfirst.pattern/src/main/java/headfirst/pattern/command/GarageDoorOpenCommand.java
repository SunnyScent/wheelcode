package headfirst.pattern.command;

/**
 * @author: SunnyScent
 * @Date: 2016-11-21
 * @Time: 13:39
 */

public class GarageDoorOpenCommand implements Command{
    Light light;

    public GarageDoorOpenCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
    }
}