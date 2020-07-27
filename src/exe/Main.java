package exe;

import storage.configuration.Language;

/**
 * 执行程序
 *
 * @author decmoon
 */
public class Main {

    protected final static Language language = Language.CHINESE;

    public static void main(String[] args) {
        FactoryMain.factoryMethod();
    }
}
