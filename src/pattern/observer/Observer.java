package pattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 观察者
 *
 * @author decmoon
 */
public class Observer {
    /**
     * 用于记录观察者名称
     */
    private String name;

    private Set<Decmoon> starts;

    public Observer(String name) {
        this.name = name;
        this.starts = new HashSet<>();
    }

    /**
     * 观察者接受信息
     *
     * @param message
     */
    public void receiveMessage(String message) {
        System.out.println("    Observer " + name + " | " + message);
    }


}
