package flash.builder;

/**
 * 传统方式的初始化理念
 * <p>
 * 本类假设创建一个容器，id，type，size是必要参数，其余参数为可选参数
 * <p>
 * 传统的方法以构造方法重载为主
 *
 * @author decmoon
 */
public class TraditionalClass extends Container {

    public TraditionalClass(int id, String type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    public TraditionalClass(int id, String type, int size, int max) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.max = max;
    }

    public TraditionalClass(int id, String type, int size, int max, int min) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.max = max;
        this.min = min;
    }
}
