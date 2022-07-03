package com.my.app.core.domain;

import com.my.app.core.domain.type.Value;

import java.util.Objects;

public interface Entity<ID extends EntityId<?>> extends ValueObject {

    ID getId();
}
