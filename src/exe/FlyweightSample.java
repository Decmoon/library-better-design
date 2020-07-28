package exe;

import pattern.flyweight.Flyweight;
import storage.entity.OppoPhone;
import storage.entity.VivoPhone;

/**
 * 执行程序-享元模式
 *
 * @author decmoon
 */
public class FlyweightSample {

    private FlyweightSample() {
    }


    public static void flyweight() {
        Flyweight flyweight = new Flyweight();
        Object object = flyweight.getObjects(VivoPhone.class);
        System.out.println("VivoPhone1 "+((VivoPhone)object).info(Main.language));
        Object object2 = flyweight.getObjects(VivoPhone.class);
        System.out.println("VivoPhone2 "+((VivoPhone)object2).info(Main.language));

        Object object3 = flyweight.getObjects(OppoPhone.class);
        System.out.println("OppoPhone1 "+((OppoPhone)object3).info(Main.language));
        Object object4 = flyweight.getObjects(OppoPhone.class);
        System.out.println("OppoPhone2 "+((OppoPhone)object4).info(Main.language));
    }
}
