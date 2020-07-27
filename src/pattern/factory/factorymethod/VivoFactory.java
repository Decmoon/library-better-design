package pattern.factory.factorymethod;

import storage.entity.Vivo;

/**
 * 工厂方法模式
 * <p>
 * Vivo手机工厂
 *
 * @author decmoon
 */
public class VivoFactory {

    public Vivo getPhone() {
        return new Vivo();
    }
}
