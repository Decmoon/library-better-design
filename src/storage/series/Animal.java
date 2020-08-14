package storage.series;

import storage.Natural;

/**
 * 动物
 *
 * @author decmoon
 */
public abstract class Animal implements Natural {

    private String scientificName;

    //---------setter ---------
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    //--------- getter ---------
    public String getScientificName() {
        return scientificName;
    }
}
