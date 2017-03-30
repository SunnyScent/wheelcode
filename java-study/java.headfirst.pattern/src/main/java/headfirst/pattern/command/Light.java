package headfirst.pattern.command;

/**
 * 灯
 * @author: SunnyScent
 * @Date: 2016-11-17
 * @Time: 22:41
 */

public class Light {
    /**
     * 开灯
     */
    void on(){
        System.out.println("Open The Light");
    }

    /**
     * 关灯
     */
    void off(){
        System.out.println("Close The Light");
    }
}