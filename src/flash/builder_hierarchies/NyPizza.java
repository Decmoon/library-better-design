package flash.builder_hierarchies;

import java.util.Objects;

public class NyPizza extends Pizza {

    private enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }


    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Pizza build() {
            return new NyPizza(self());
        }
    }

}
