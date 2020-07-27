package storage.entity;

import storage.configuration.Language;
import storage.series.Phone;

import java.util.Objects;

public class Oppo extends Phone {


    public String info(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TO_STRING).append("Oppo[");
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
