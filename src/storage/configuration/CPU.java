package storage.configuration;

/**
 * CPU
 *
 * @author decmoon
 */
public enum CPU implements Enumeration {

    INTEL("Intel", "英特尔"),
    LOONGSON("Loongson", "龙芯");


    private String englishName;
    private String chineseName;

    CPU(String englishName, String chineseName) {
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
