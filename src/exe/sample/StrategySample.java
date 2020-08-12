package exe.sample;

import exe.Main;
import pattern.strategy.Execute;
import pattern.strategy.MultithreadedBranch;
import storage.utils.LanguageUtils;

/**
 * 执行程序-状态模式
 *
 * @author decmoon
 */
public class StrategySample {

    private StrategySample() {
    }

    public static void strategy() {
        String name = LanguageUtils.of(Main.language, "strategy of thread", "策略线程");
        MultithreadedBranch.runnableThread(new MyStrategy(), name);
    }

    private static class MyStrategy implements Execute {

        @Override
        public void execute() {
            System.out.println(Thread.currentThread().getName() + "  " + LanguageUtils.of(Main.language, "running", "运行中"));
        }

    }

}
