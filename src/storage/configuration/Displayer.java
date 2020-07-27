package storage.configuration;

/**
 * 显示器
 *
 * @author decmoon
 */
public enum Displayer {

    SAMSUNG("SAMSUNG", "三星"),
    LENOVO("Lenovo", "联想");

    private String englishName;
    private String chineseName;

    Displayer(String englishName, String chineseName) {
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
