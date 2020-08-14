package storage.series;

import storage.ElectronicProduct;
import storage.configuration.Battery;
import storage.configuration.Brand;
import storage.configuration.CPU;
import storage.configuration.Language;
import storage.utils.LanguageUtils;

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

    //------ override -----------

    @Override
    public void turnOn(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[')
                .append(getBrand(language))
                .append(']')
                .append(
                        LanguageUtils.of(language, "phone --> turn on", "手机 --> 启动")
                );
        System.out.println(stringBuilder.toString());
    }

    @Override
    public void turnOff(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[')
                .append(getBrand(language))
                .append(']')
                .append(
                        LanguageUtils.of(language, "phone --> turn off", "手机 --> 关机")
                );
        System.out.println(stringBuilder.toString());
    }


    //------ setter --------------

    public void setCPU(storage.configuration.CPU cpu) {
        this.cpu = cpu;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    protected void setBrand(Brand brand) {
        this.brand = brand;
    }

    //------ getter --------------

    public String getCPU(Language language) {
        if (Objects.isNull(cpu)) {
            return "";
        }
        return cpu.getName(language);
    }

    public String getBattery(Language language) {
        if (Objects.isNull(battery)) {
            return "";
        }
        return battery.getName(language);
    }

    public String getBrand(Language language) {
        if (Objects.isNull(brand)) {
            return "";
        }
        return brand.getName(language);
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
