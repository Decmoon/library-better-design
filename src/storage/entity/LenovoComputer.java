package storage.entity;

import storage.configuration.Brand;
import storage.configuration.Displayer;
import storage.series.Computer;

/**
 * 联想 电脑
 *
 * @author decmoon
 */
public class LenovoComputer extends Computer {
    {
        setBrand(Brand.LENOVO);
        setDisplayer(Displayer.LENOVO);
    }
}
