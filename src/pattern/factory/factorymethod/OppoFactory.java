package pattern.factory.factorymethod;

import storage.entity.OppoPhone;

/**
 * 工厂方法模式
 * <p>
 * Oppo 手机工厂
 *
 * @author decmoon
 */
public class OppoFactory {
    public OppoPhone getPhone() {
        return new OppoPhone();
    }
}
