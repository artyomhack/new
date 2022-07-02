package com.my.app.domain.user;

import com.my.app.core.domain.DomainEntity;

public class UserId extends DomainEntity.IdAsInt {

    public static UserId empty = new UserId(emptyValue);

    private UserId(Object src) {
        super(src, UserRequest.class);
    }

    public static UserId of(Object src) {
        return new UserId(src);
    }

}