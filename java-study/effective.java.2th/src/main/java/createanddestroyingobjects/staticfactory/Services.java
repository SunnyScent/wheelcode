package createanddestroyingobjects.staticfactory;

/**
 * @author: SunnyScent
 * @Date: 2016-12-19
 * @Time: 16:59
 */

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Noninstantiable class for service registration and access
 */
public class Services {
    //prevents instantiation
    private Services() {
    }

    private static final Map<String, Provider> PROVIDER_MAP = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //Provider registration API
    public static void registerDefaultProvider(Provider p) {
        PROVIDER_MAP.put(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        PROVIDER_MAP.put(name, p);
    }

    //Service access API
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider p= PROVIDER_MAP.get(name);
        if(p==null){
            throw new IllegalArgumentException("No provider registered with name "+name);
        }
        return p.newService();
    }

}