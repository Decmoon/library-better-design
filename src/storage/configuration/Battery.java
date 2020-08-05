package storage.configuration;

/**
 * 电池
 *
 * @author decmoon
 */
public enum Battery implements Enumeration {
    PISEN("PISEN", "品胜");

    private String englishName;
    private String chineseName;

    Battery(String englishName, String chineseName) {
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
