package pattern.factory.staticfactory;

import storage.configuration.Brand;
import storage.entity.Oppo;
import storage.entity.Vivo;
import storage.series.Phone;

/**
 * 极简工厂/静态工厂模式
 *
 * @author decmoon
 */
public class Simplest {


    private Simplest() {
    }

    /**
     * @param brand 厂商
     * @return 手机
     */
    public static Phone switchPhone(Brand brand) {

        switch (brand) {
            case OPPO:
                return new Oppo();
            case VIVO:
                return new Vivo();
            default:
                break;
        }
        return null;
    }


}
