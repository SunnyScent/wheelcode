package createanddestroyingobjects.staticfactory;

/**
 * @author: SunnyScent
 * @Date: 2016-12-19
 * @Time: 16:57
 */

/***
 * Service provider interface
 */
public interface Provider {
    Service newService();
}