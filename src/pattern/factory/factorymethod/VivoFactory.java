package pattern.factory.factorymethod;

import storage.entity.VivoPhone;

/**
 * 工厂方法模式
 * <p>
 * Vivo手机工厂
 *
 * @author decmoon
 */
public class VivoFactory {

    public VivoPhone getPhone() {
        return new VivoPhone();
    }
}
