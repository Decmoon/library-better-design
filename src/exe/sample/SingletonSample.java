package exe.sample;

import pattern.singleton.dynamicload.DynamicLoad;
import pattern.singleton.enumsingleton.EnumSingletonClass;
import pattern.singleton.innerclass.InnerClass;
import pattern.singleton.preloaded.Preloaded;

/**
 * 执行程序-单例模式
 *
 * @author decmoon
 */
public class SingletonSample {

    private SingletonSample(){}

    public static void dynamicLoad() {
        DynamicLoad object1 = DynamicLoad.getInstance();
        DynamicLoad object2 = DynamicLoad.getInstance();
        System.out.println("object1 "+object1);
        System.out.println("object2 "+object2);
        System.out.println("equals="+(object1==object2));
    }
    public static void preloaded() {
        Preloaded object1 = Preloaded.getInstance();
        Preloaded object2 = Preloaded.getInstance();
        System.out.println("object1 "+object1);
        System.out.println("object2 "+object2);
        System.out.println("equals="+(object1==object2));
    }

    public static void innerClass() {
        InnerClass object1 = InnerClass.getInstance();
        InnerClass object2 = InnerClass.getInstance();
        System.out.println("object1 "+object1);
        System.out.println("object2 "+object2);
        System.out.println("equals="+(object1==object2));
    }

    public static void enumSingletonClass() {
        EnumSingletonClass object1 = EnumSingletonClass.ENUM_SINGLETON_CLASS;
        EnumSingletonClass object2 = EnumSingletonClass.ENUM_SINGLETON_CLASS;
        System.out.println("object1 "+Integer.toHexString(object1.hashCode()));
        System.out.println("object2 "+Integer.toHexString(object2.hashCode()));
        System.out.println("equals="+(object1==object2));
    }
}
