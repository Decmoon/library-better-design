package flash.builder;

/**
 * 容器
 *
 * @author decmoon
 */
public abstract class Container {
    //必备参数
    protected int id;
    //必备参数
    protected String type;
    //必备参数 初始化容量
    protected int size;
    //可选参数 最大容量
    protected int max;
    //可选参数 最小容量
    protected int min;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
