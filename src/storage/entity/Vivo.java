package storage.entity;

import storage.configuration.Brand;
import storage.configuration.Language;
import storage.series.Phone;

import java.util.Objects;

/**
 * Vivo 手机
 *
 * @author decmoon
 */
public class Vivo extends Phone {


    public Vivo() {
    }

    public String info(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TO_STRING).append("Vivo[");
        if (Objects.nonNull(cpu)) {
            stringBuilder.append("cpu=" + getCPU(language))
                    .append(" | ");
        }
        if (Objects.nonNull(battery)) {
            stringBuilder.append("Battery=" + getBattery(language))
                    .append(" | ");
        }

        stringBuilder.append("hashCode=" + Integer.toHexString(hashCode()))
                .append("]");
        return stringBuilder.toString();
    }

}
