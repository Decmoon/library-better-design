package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * github帐号作者
 *
 * @author decmoon
 */
public class Decmoon {

    String AUTHOR_NAME = "Decmoon";

    /**
     * 未开源项目
     */
    private static final LibraryBetterDesign libraryBetterDesign = new LibraryBetterDesign();

    /**
     * 未开源项目
     */
    private static final Shortcut shortcut = new Shortcut();

    /**
     * 开源 Library-Better-Design 项目
     *
     * @return LibraryBetterDesign
     */
    public LibraryBetterDesign openSourceLibraryBetterDesign() {
        return libraryBetterDesign;
    }

    /**
     * 开源 Shortcut 项目
     *
     * @return Shortcut
     */
    public Shortcut openSourceShortcut() {
        return shortcut;
    }
}
