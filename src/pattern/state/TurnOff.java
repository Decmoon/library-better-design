package pattern.state;

import storage.configuration.Language;
import storage.utils.PrintUtils;

import javax.xml.ws.Action;

/**
 * 关机状态
 *
 * @author decmoon
 */
public class TurnOff implements State {

    private TurnOff() {

    }

    public static TurnOff getInstance() {
        return inner.turnOff;
    }

    static class inner {
        private static final TurnOff turnOff = new TurnOff();
    }

    @Override
    public void canDo(Language language) {
        PrintUtils.println(language,
                "Current state:[Turn off]\nCan perform operations:turn on the phone",
                "当前状态[关机]\n可以执行操作：开机");
    }

}
