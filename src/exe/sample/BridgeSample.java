package exe.sample;

import exe.Main;
import storage.configuration.CPU;
import storage.configuration.Displayer;
import storage.configuration.GPU;
import storage.configuration.Mainboard;
import storage.entity.LenovoComputer;
import storage.series.Computer;
import storage.utils.PrintUtils;

/**
 * 执行程序-桥接模式
 *
 * @author decmoon
 */
public class BridgeSample {

    private BridgeSample() {
    }

    public static void bridge() {
        //生产联想电脑所需部件
        storage.configuration.CPU cpu;
        Mainboard mainboard;
        storage.configuration.GPU gpu;

        //创建联想电脑1
        Computer lenovoComputer1 = new LenovoComputer();
        cpu = CPU.INTEL;
        mainboard = Mainboard.ASUS;
        gpu = GPU.NVIDIA;
        lenovoComputer1.setCPU(cpu);
        lenovoComputer1.setMainboard(mainboard);
        lenovoComputer1.setGpu(gpu);
        PrintUtils.println(Main.language, "Lenovo computer type 1:", "联想电脑型号1：");
        System.out.println(lenovoComputer1.info(Main.language));

        //生产联想电脑型号2
        Computer lenovoComputer2 = new LenovoComputer();
        cpu = CPU.LOONGSON;
        mainboard = Mainboard.MICRO_STAR;
        gpu = GPU.NVIDIA;
        lenovoComputer2.setCPU(cpu);
        lenovoComputer2.setMainboard(mainboard);
        lenovoComputer2.setGpu(gpu);
        PrintUtils.println(Main.language, "Lenovo computer type 2:", "联想电脑型号2：");
        System.out.println(lenovoComputer2.info(Main.language));

    }

}
