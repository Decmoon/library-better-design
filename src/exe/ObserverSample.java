package exe;

import pattern.observer.Decmoon;
import pattern.observer.LibraryBetterDesign;
import pattern.observer.Observer;
import pattern.observer.Shortcut;
import storage.utils.PrintUtils;

/**
 * 执行程序-观察者模式
 *
 * @author decmoon
 */
public class ObserverSample {

    private ObserverSample() {
    }

    public static void observer() {
        //作者注册github
        Decmoon decmoon = new Decmoon();
        //开源项目 libraryBetterDesign
        LibraryBetterDesign libraryBetterDesign = decmoon.openSourceLibraryBetterDesign();
        //开源项目 shortcut
        Shortcut shortcut = decmoon.openSourceShortcut();

        //当前项目已开源，可供用户标星
        //观察者
        Observer melissa = new Observer("melissa");
        Observer sherry = new Observer("sherry");
        Observer jerry = new Observer("jerry");

        //订阅项目
        // Meli 在两项目界面标星订阅
        libraryBetterDesign.star(melissa);
        shortcut.star(melissa);
        //sherry 标星 libraryBetterDesign
        libraryBetterDesign.star(sherry);
        //jerry 标星 shortcut
        shortcut.star(jerry);

        //作者进行修改推送
        PrintUtils.println(Main.language,
                "Author updated at LibraryBetterDesign",
                "作者在 LibraryBetterDesign 上更新：");
        libraryBetterDesign.sendMessage("Update observer pattern");


        PrintUtils.println(Main.language,
                "Author updated at Shortcut",
                "作者在 Shortcut 上更新：");
        shortcut.sendMessage("Version 0.09 upgrade");

        //sherry 取关 LibraryBetterDesign 后由 作者发送消息
        libraryBetterDesign.unStar(sherry);
        PrintUtils.println(Main.language,
                "Author updated at LibraryBetterDesign",
                "作者在 LibraryBetterDesign 上更新：");
        libraryBetterDesign.sendMessage("Modify README.md");
    }
}
