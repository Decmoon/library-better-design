package flash.builder;

/**
 * builder 初始化理念
 * <p>
 * 本类假设创建一个容器，id，type，size是必要参数，其余参数为可选参数
 * <p>
 * 解决了 实例化代码块重复率较高的问题
 *
 * @author decmoon
 */
public class BuilderClass extends Container {


    public static class Builder extends Container {

        public Builder(int id, String type, int size) {
            this.id = id;
            this.type = type;
            this.size = size;
        }

        public Builder max(int max) {
            this.max = max;
            return this;
        }

        public Builder min(int min) {
            this.min = min;
            return this;
        }

        public BuilderClass builder() {
            return new BuilderClass(this);
        }
    }

    private BuilderClass(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.size = builder.size;
        this.max = builder.max;
        this.min = builder.min;

    }

    public static void main(String[] args) {
        Container a = new BuilderClass.Builder(1,"a",10).builder();
    }
}
