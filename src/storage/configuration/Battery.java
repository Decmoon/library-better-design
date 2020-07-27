package storage.configuration;

/**
 * 电池
 *
 * @author decmoon
 */
public enum Battery {
    PISEN("PISEN", "品胜");

    private String englishName;
    private String chineseName;

    Battery(String englishName, String chineseName) {
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
