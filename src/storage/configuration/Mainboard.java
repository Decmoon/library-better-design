package storage.configuration;

/**
 * 主板
 *
 * @author decmoon
 */
public enum Mainboard {

    MICRO_STAR("Micro-Star International Co., Ltd.", "微星"),
    ASUS("ASUS", "华硕");

    private String englishName;
    private String chineseName;

    Mainboard(String englishName, String chineseName) {
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
