package storage.configuration;

/**
 * 枚举名称获取接口
 *
 * @author decmoon
 */
public interface Enumeration {

    String getEnglishName();

    String getChineseName();

    default String getName(Language language) {
        switch (language) {
            case ENGLISH:
                return getEnglishName();
            case CHINESE:
                return getChineseName();
            default:
                return getEnglishName();
        }
    }
}
