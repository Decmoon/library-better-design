package storage.utils;

import storage.configuration.Language;

public class PrintUtils {

    private PrintUtils() {
    }

    public static void println(Language language, String englishMessage, String chineseMessage) {
        switch (language) {
            case CHINESE:
                System.out.println(chineseMessage);
                break;
            case ENGLISH:
                System.out.println(englishMessage);
                break;
            default:
                System.out.println(englishMessage);
                break;
        }
    }
}
