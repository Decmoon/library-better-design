package storage.configuration;

/**
 * 显示器
 *
 * @author decmoon
 */
public enum Displayer implements Enumeration {

    SAMSUNG("SAMSUNG", "三星"),
    LENOVO("Lenovo", "联想");

    private String englishName;
    private String chineseName;

    Displayer(String englishName, String chineseName) {
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
