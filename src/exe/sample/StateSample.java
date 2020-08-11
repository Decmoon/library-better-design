package exe.sample;

import exe.Main;
import pattern.state.VivoPhoneState;
import storage.utils.PrintUtils;

/**
 * 执行程序-状态模式
 *
 * @author decmoon
 */
public class StateSample {

    private StateSample() {

    }

    public static void state() {
        //获取手机
        VivoPhoneState vivoPhone = new VivoPhoneState();
        //新买的手机状态
        PrintUtils.println(Main.language, "The status of your new phone:", "新买的手机状态：");
        vivoPhone.canDo(Main.language);
        PrintUtils.hr();
        //开机
        vivoPhone.turnOn(Main.language);
        //开机后状态
        vivoPhone.canDo(Main.language);
        PrintUtils.hr();
        //关机
        vivoPhone.turnOff(Main.language);
        //关机后状态
        vivoPhone.canDo(Main.language);
    }

}
