package storage.configuration;

/**
 * 品牌
 *
 * @author decmoon
 */
public enum Brand implements Enumeration {

    LENOVO("Lenovo", "联想"),
    VIVO("Vivo", "Vivo"),
    XIAOMI("Xiaomi", "小米"),
    OPPO("OPPO", "OPPO");

    private String englishName;
    private String chineseName;

    Brand(String englishName, String chineseName) {
        this.englishName = englishName;
        this.chineseName = chineseName;
    }

    @Override
    public String getEnglishName() {
        return englishName;
    }

    @Override
    public String getChineseName() {
        return chineseName;
    }

}
