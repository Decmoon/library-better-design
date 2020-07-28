package storage.series;

import storage.ElectronicProduct;
import storage.configuration.Battery;
import storage.configuration.Brand;
import storage.configuration.CPU;
import storage.configuration.Language;

import java.util.Objects;

/**
 * 手机抽象类
 *
 * @author decmoon
 */
public abstract class Phone implements ElectronicProduct {
    /** 微处理器 */
    protected storage.configuration.CPU cpu;
    /** 电池 */
    protected Battery battery;
    /** 品牌 */
    protected Brand brand;

    //------ getter and setter --------------

    public void setCPU(storage.configuration.CPU cpu) {
        this.cpu = cpu;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    protected void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getCPU(Language language) {
        if (Objects.isNull(cpu)) {
            return "";
        }
        switch (language) {
            case ENGLISH:
                return cpu.getEnglishName();
            case CHINESE:
                return cpu.getChineseName();
            default:
                return cpu.getEnglishName();
        }
    }

    public String getBattery(Language language) {
        if (Objects.isNull(battery)) {
            return "";
        }
        switch (language) {
            case ENGLISH:
                return battery.getEnglishName();
            case CHINESE:
                return battery.getChineseName();
            default:
                return battery.getEnglishName();
        }
    }

    public String getBrand(Language language) {
        if (Objects.isNull(brand)) {
            return "";
        }
        switch (language) {
            case ENGLISH:
                return brand.getEnglishName();
            case CHINESE:
                return brand.getChineseName();
            default:
                return brand.getEnglishName();
        }
    }

    public String info(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TO_STRING);
        if (Objects.nonNull(brand)) {
            stringBuilder.append(getBrand(language));
        }
        stringBuilder.append("[");
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
