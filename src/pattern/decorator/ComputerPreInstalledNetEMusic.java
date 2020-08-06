package pattern.decorator;

import storage.configuration.Language;
import storage.configuration.Software;
import storage.series.Computer;

/**
 * 电脑 装饰器
 *
 * @author decmoon
 * @see Computer
 */
public class ComputerPreInstalledNetEMusic extends Computer {

    private Computer computer;

    //电脑预安装软件
    //Pre-installed software
    private Software NetEMusic;

    public ComputerPreInstalledNetEMusic(Computer computer) {
        this.computer = computer;
        this.NetEMusic = Software.NET_E_MUSIC;
    }


    public String info(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(computer.info(language))
                .append('[')
                .append(NetEMusic.getName(language))
                .append(']');
        return stringBuilder.toString();
    }
}
