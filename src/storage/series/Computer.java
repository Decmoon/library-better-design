package storage.series;

import storage.ElectronicProduct;

/**
 * 电脑
 *
 * @author decmoon
 */
public abstract class Computer implements ElectronicProduct {
    /** 微处理器 */
    String CPU;
    /** 显示屏 */
    String displayer;
    /** 主板 */
    String mainboard;
    /** 显卡 */
    String GPU;
    /** 品牌 */
    String brand;
}
