package storage.configuration;

/**
 * 品牌
 *
 * @author decmoon
 */
public enum Brand {

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

    public String getEnglishName() {
        return englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

}
