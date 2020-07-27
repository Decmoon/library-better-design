package pattern.factory.factorymethod;

import storage.entity.Oppo;

/**
 * 工厂方法模式
 * <p>
 * Oppo 手机工厂
 *
 * @author decmoon
 */
public class OppoFactory {
    public Oppo getPhone() {
        return new Oppo();
    }
}
