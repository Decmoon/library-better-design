package storage.series;

import storage.ElectronicProduct;
import storage.configuration.*;
import storage.utils.LanguageUtils;

import java.util.Objects;

/**
 * 电脑
 *
 * @author decmoon
 */
public abstract class Computer implements ElectronicProduct {
    /** 微处理器 */
    storage.configuration.CPU cpu;
    /** 显示屏 */
    Displayer displayer;
    /** 主板 */
    Mainboard mainboard;
    /** 显卡 */
    storage.configuration.GPU gpu;
    /** 品牌 */
    Brand brand;

    //------ override -----------

    @Override
    public void turnOn(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[')
                .append(getBrand(language))
                .append(']')
                .append(
                        LanguageUtils.of(language, "computer --> turn on", "电脑 --> 启动")
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
                        LanguageUtils.of(language, "computer --> turn off", "电脑 --> 关机")
                );
        System.out.println(stringBuilder.toString());
    }

    //--------- getter and setter -------------

    public void setCPU(storage.configuration.CPU cpu) {
        this.cpu = cpu;
    }

    public void setDisplayer(Displayer displayer) {
        this.displayer = displayer;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public void setGpu(storage.configuration.GPU gpu) {
        this.gpu = gpu;
    }

    protected void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getCPU(Language language) {
        if (Objects.isNull(cpu)) {
            return "";
        }
        return cpu.getName(language);
    }

    public String getDisplayer(Language language) {
        if (Objects.isNull(displayer)) {
            return "";
        }
        return displayer.getName(language);
    }

    public String getMainboard(Language language) {
        if (Objects.isNull(mainboard)) {
            return "";
        }
        return mainboard.getName(language);
    }

    public String getGPU(Language language) {
        if (Objects.isNull(gpu)) {
            return "";
        }
        return gpu.getName(language);
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
        if (Objects.nonNull(displayer)) {
            stringBuilder.append("displayer=" + getDisplayer(language))
                    .append(" | ");
        }
        if (Objects.nonNull(mainboard)) {
            stringBuilder.append("mainboard=" + getMainboard(language))
                    .append(" | ");
        }
        if (Objects.nonNull(gpu)) {
            stringBuilder.append("gpu=" + getGPU(language))
                    .append(" | ");
        }
        stringBuilder.append("hashCode=" + Integer.toHexString(hashCode()))
                .append("]");
        return stringBuilder.toString();
    }
}
