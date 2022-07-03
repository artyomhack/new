package com.my.app.core.domain;

import com.my.app.core.domain.type.Value;

import java.util.Objects;

public interface Entity extends ValueObject, Comparable<Entity> {

    interface ID<T> extends Value<T> {
        boolean isEmpty();
    }

    abstract class IdAsInt extends Value.AsPositiveInt implements ID<Integer> {

        public static int emptyValue = 0;

        private final Class<? extends DomainEntity> domainClass;

        protected IdAsInt(Object src, Class<? extends DomainEntity> domainClass) {
            super(src, true);
            this.domainClass = domainClass;
        }

        @Override
        final public boolean isEmpty() {
            return this.getValue() == emptyValue;
        }

        @Override
        final public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IdAsInt idAsInt = (IdAsInt) o;
            if(!Objects.equals(domainClass, idAsInt.domainClass)) {
                return false;
            };
            if (!Objects.equals(getValue(), idAsInt.getValue())) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash(domainClass);
        }
    }
}
