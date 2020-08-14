package flash.builder;

/**
 * 传统改进方式的初始化理念
 * <p>
 * 本类假设创建一个容器，id，type，size是必要参数，其余参数为可选参数
 * <p>
 * 传统的改进方案依然以构造方法重载为主，解决代码冗余问题
 *
 * @author decmoon
 */
public class TraditionalImproveClass extends Container {

    public TraditionalImproveClass(int id, String type, int size) {
        this(id, type, size, 0, 0);
    }

    public TraditionalImproveClass(int id, String type, int size, int max) {
        this(id, type, size, max, 0);
    }

    public TraditionalImproveClass(int id, String type, int size, int max, int min) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.max = max;
        this.min = min;
    }
}
