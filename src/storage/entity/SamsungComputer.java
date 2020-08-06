package storage.entity;

import storage.configuration.Brand;
import storage.configuration.Displayer;
import storage.series.Computer;

/**
 * 三星 电脑
 *
 * @author decmoon
 */
public class SamsungComputer extends Computer {

    {
        setBrand(Brand.SAMSUNG);
        setDisplayer(Displayer.SAMSUNG);
    }

}
