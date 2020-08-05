package storage.configuration;

/**
 * 主板
 *
 * @author decmoon
 */
public enum Mainboard implements Enumeration {

    MICRO_STAR("Micro-Star International Co., Ltd.", "微星"),
    ASUS("ASUS", "华硕");

    private String englishName;
    private String chineseName;

    Mainboard(String englishName, String chineseName) {
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
