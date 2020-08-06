package exe;

import pattern.decorator.ComputerPreInstalledNetEMusic;
import pattern.decorator.ComputerPreInstalledQQ;
import pattern.decorator.ComputerPreInstalledWeChat;
import storage.entity.LenovoComputer;
import storage.entity.SamsungComputer;
import storage.series.Computer;

/**
 * 执行程序-装饰模式
 *
 * @author decmoon
 */
public class DecoratorSample {

    private DecoratorSample() {
    }

    public static void decorator() {
        //新建联想电脑 [单独实体]
        Computer lenovoComputer = new LenovoComputer();
        //进行软件预安装
        //安装QQ
        lenovoComputer = new ComputerPreInstalledQQ(lenovoComputer);
        //安装网易云音乐
        lenovoComputer = new ComputerPreInstalledNetEMusic(lenovoComputer);
        //安装微信
        lenovoComputer = new ComputerPreInstalledWeChat(lenovoComputer);
        //软件预安装后的联想电脑
        System.out.println(lenovoComputer.info(Main.language));

        System.out.println("======================================");

        //新建三星电脑[单独实体]
        Computer samsungComputer = new SamsungComputer();
        //进行软件预安装
        //安装网易云音乐
        samsungComputer = new ComputerPreInstalledNetEMusic(samsungComputer);
        //安装微信
        samsungComputer = new ComputerPreInstalledWeChat(samsungComputer);
        //软件预安装后的三星电脑
        System.out.println(samsungComputer.info(Main.language));
    }

}
