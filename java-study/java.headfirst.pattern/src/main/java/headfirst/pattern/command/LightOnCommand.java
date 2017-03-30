package headfirst.pattern.command;

/**
 * 开灯命令
 * @author: SunnyScent
 * @Date: 2016-11-17
 * @Time: 22:44
 */

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}