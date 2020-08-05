package storage.configuration;

/**
 * 显卡
 *
 * @author decmoon
 */
public enum GPU implements Enumeration {

    NVIDIA("NVIDIA", "英伟达");

    private String englishName;
    private String chineseName;

    GPU(String englishName, String chineseName) {
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
