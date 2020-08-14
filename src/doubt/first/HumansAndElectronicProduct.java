package doubt.first;

import storage.ElectronicProduct;
import storage.configuration.Language;
import storage.series.Animal;

/**
 * @author decmoon
 */
public class HumansAndElectronicProduct extends Animal implements ElectronicProduct {

    {
        setScientificName("humans");
    }

    @Override
    public void turnOn(Language language) {
        System.out.println(getScientificName() + " can turn on electrical appliances");
    }

    @Override
    public void turnOff(Language language) {
        System.out.println(getScientificName() + " can turn off electrical appliances");
    }

    @Override
    public void breathe() {
        System.out.println(getScientificName() + " breathe on oxygen");
    }
}
