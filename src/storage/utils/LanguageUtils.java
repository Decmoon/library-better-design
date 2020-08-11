package storage.utils;

import storage.configuration.Language;

/**
 * 语言工具
 *
 * @author decmoon
 */
public class LanguageUtils {

    private LanguageUtils() {
    }

    public static String of(Language language, String englishMessage, String chineseMessage) {
        switch (language) {
            case ENGLISH:
                return englishMessage;
            case CHINESE:
                return chineseMessage;
            default:
                return englishMessage;
        }
    }

}