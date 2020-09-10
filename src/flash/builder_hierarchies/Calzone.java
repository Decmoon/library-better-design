package flash.builder_hierarchies;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    static class Builder extends Pizza.Builder<Builder> {
        // default
        private boolean sauceInside = false;

        public Builder addSauceInside() {
            sauceInside = true;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Pizza build() {
            return new Calzone(this);
        }

    }


}
