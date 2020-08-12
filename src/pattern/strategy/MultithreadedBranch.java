package pattern.strategy;

import java.util.Objects;

/**
 * 多线程启动封装
 *
 * @author decmoon
 * @url https://github.com/Decmoon/shortcut/blob/master/src/main/java/com/decmoon/shortcut/thread/MultithreadedBranch.java
 */
public class MultithreadedBranch {

    private MultithreadedBranch() {
    }

    public static void runnableThread(Execute execute) {
        runnableThread(execute, null);
    }


    public static void runnableThread(Execute execute, String threadName) {
        if (Objects.isNull(threadName)) {
            new Thread(() -> {
                execute.execute();
            }).start();
        } else {
            new Thread(() -> {
                execute.execute();
            }, threadName).start();
        }
    }

}
