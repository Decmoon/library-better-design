package storage;

import storage.configuration.Language;

/**
 * 电子产品
 *
 * @author decmoon
 */
public interface ElectronicProduct {

    Integer VOLTAGE = 120;
    String UNIT = "V";
    String TO_STRING = "  ";

    void turnOn(Language language);

    void turnOff(Language language);

}
