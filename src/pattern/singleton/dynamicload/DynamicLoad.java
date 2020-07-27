package pattern.singleton.dynamicload;

import java.util.Objects;

/**
 * 动态加载单例模式
 *
 * @author decmoon
 */
public class DynamicLoad {

    private static DynamicLoad dynamicLoad;


    public static DynamicLoad getInstance() {
        if (Objects.isNull(dynamicLoad)) {
            dynamicLoad = new DynamicLoad();
        }
        return dynamicLoad;
    }

}
