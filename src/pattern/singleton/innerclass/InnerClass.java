package pattern.singleton.innerclass;

/**
 * 内部类单例模式
 *
 * @author decmoon
 */
public class InnerClass {

    private InnerClass() {

    }

    public static InnerClass getInstance() {
        return inner.innerclass;
    }

    private static class inner {
        private final static InnerClass innerclass = new InnerClass();
    }
}
