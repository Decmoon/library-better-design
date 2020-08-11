package exe;

import exe.sample.DecoratorSample;
import exe.sample.StateSample;
import storage.configuration.Language;

/**
 * 执行程序
 *
 * @author decmoon
 */
public class Main {

    /**
     * 更改您所用的语言
     * <p>
     * Change the language you are using
     */
    public final static Language language = Language.CHINESE;


    public static void main(String[] args) {
        StateSample.state();
    }
}
