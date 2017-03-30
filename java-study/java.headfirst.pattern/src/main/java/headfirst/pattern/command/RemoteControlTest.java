package headfirst.pattern.command;

/**
 * 测试
 * @author: SunnyScent
 * @Date: 2016-11-17
 * @Time: 22:48
 */

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }
}