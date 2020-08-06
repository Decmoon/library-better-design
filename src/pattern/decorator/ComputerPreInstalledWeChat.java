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
public class ComputerPreInstalledWeChat extends Computer {

    private Computer computer;

    //电脑预安装软件
    //Pre-installed software
    private Software WeChat;

    public ComputerPreInstalledWeChat(Computer computer) {
        this.computer = computer;
        this.WeChat = Software.WE_CHAT;
    }


    public String info(Language language) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(computer.info(language))
                .append('[')
                .append(WeChat.getName(language))
                .append(']');
        return stringBuilder.toString();
    }
}
