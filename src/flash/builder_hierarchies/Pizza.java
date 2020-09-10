package flash.builder_hierarchies;

import flash.builder.BuilderClass;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    final Set<Topping> toppings;

    /** the size of pizza */
    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        //subclasses must override
        protected abstract T self();

        abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}

