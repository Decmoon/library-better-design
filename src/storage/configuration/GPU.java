package storage.configuration;

/**
 * 显卡
 *
 * @author decmoon
 */
public enum GPU {
    NVIDIA("NVIDIA", "英伟达");
    private String englishName;
    private String chineseName;

    GPU(String englishName, String chineseName) {
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
