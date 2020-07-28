package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 *
 * @author decmoon
 */
public class Flyweight {


    /**
     * 创建容器，存储单例对象
     */
    private static final Map<Class, Object> map = new HashMap<>();


    public Object getObjects(Class clazz) {
        if (map.containsKey(clazz)) {
            return map.get(clazz);
        }
        try {
            //如果为接口，可以进行 new 等创建方式
            Object object = clazz.newInstance();
            map.put(clazz, object);
            return object;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
