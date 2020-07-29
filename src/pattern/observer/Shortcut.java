package pattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Shortcut 项目
 *
 * @author decmoon
 * @url https://github.com/Decmoon/shortcut
 */
public class Shortcut extends Decmoon {
    /**
     * 此项目被关注的用户
     */
    private Set<Observer> observers = new HashSet<>();

    /**
     * 推送消息
     *
     * @param message
     */
    public void sendMessage(String message) {
        for (Observer observer : observers) {
            observer.receiveMessage(AUTHOR_NAME+": "+message);
        }
    }

    /**
     * 标星订阅
     *
     * @param observer 观察者
     */
    public void star(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消订阅
     *
     * @param observer 观察者
     */
    public void unStar(Observer observer) {
        observers.remove(observer);
    }
}
