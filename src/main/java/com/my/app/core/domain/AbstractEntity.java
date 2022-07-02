package com.my.app.core.domain;

public abstract class AbstractEntity implements Entity {

    @Override
    public int compareTo(Entity o) {
        return 0;
    }
}
