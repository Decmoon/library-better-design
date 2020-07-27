package pattern.singleton.preloaded;

/**
 * 预加载单例模式
 *
 * @author decmoon
 */
public class Preloaded {

    private final static Preloaded preloaded = new Preloaded();

    /**
     * 防止对象创建
     */
    private Preloaded() {

    }

    /**
     * 对象获取
     *
     * @return Preloaded
     */
    public static Preloaded getInstance() {
        return preloaded;
    }
}
