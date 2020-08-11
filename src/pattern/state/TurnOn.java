package pattern.state;

import storage.configuration.Language;
import storage.utils.LanguageUtils;
import storage.utils.PrintUtils;

/**
 * 开机状态
 *
 * @author decmoon
 */
public class TurnOn implements State {

    private TurnOn() {

    }

    public static TurnOn getInstance() {
        return inner.turnOn;
    }

    static class inner {
        private static final TurnOn turnOn = new TurnOn();
    }

    @Override
    public void canDo(Language language) {
        PrintUtils.println(language,
                "Current state:[Turn on]\nCan perform operations:listen music,send messages,call, ..... ,turn off the phone",
                "当前状态[已启动]\n可以执行操作：听音乐，发短信，打电话，..... ，关机");
    }

}
