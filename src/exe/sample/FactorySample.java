package exe.sample;

import pattern.factory.factorymethod.OppoFactory;
import pattern.factory.factorymethod.VivoFactory;
import pattern.factory.staticfactory.Simplest;
import storage.configuration.Brand;
import storage.utils.PrintUtils;

import static exe.Main.language;

/**
 * 执行程序-工厂模式
 *
 * @author decmoon
 */
public class FactorySample {

    private FactorySample() {
    }

    public static void simplestFactory() {
        PrintUtils.println(language, "simplestFactory:", "简单/静态工厂模式");
        //取出 OPPO
        System.out.println(Simplest.switchPhone(Brand.OPPO).info(language));
        //取出 VIVO
        System.out.println(Simplest.switchPhone(Brand.VIVO).info(language));
    }


    public static void factoryMethod() {
        PrintUtils.println(language, "FactoryMethods:", "工厂方法模式");
        //取出 OPPO
        OppoFactory oppoFactory = new OppoFactory();
        System.out.println(oppoFactory.getPhone().info(language));
        //取出 VIVO
        VivoFactory vivoFactory = new VivoFactory();
        System.out.println(vivoFactory.getPhone().info(language));
    }
}
