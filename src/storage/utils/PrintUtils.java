package storage.utils;

import storage.configuration.Language;

public class PrintUtils {

    private PrintUtils() {
    }

    public static void println(Language language, String englishMessage, String chineseMessage) {
        System.out.println(LanguageUtils.of(language, englishMessage, chineseMessage));
    }

    public static void hr() {
        System.out.println("--------------------------------------------------------------------------");
    }
}
