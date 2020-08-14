package flash.builder;

/**
 * 构造方法 + Setter的初始化理念
 * <p>
 * 本类假设创建一个容器，id，type，size是必要参数，其余参数为可选参数
 * <p>
 * 解决了 构造方法重载过多的问题
 *
 * @author decmoon
 */
public class SetterClass extends Container {
    /**
     * 构造方法只要求填写必要参数，其余参数通过 Setter 赋值
     *
     * @param id   必备参数
     * @param type 必备参数
     * @param size 必备参数 初始化容量
     */
    public SetterClass(int id, String type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }


    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
