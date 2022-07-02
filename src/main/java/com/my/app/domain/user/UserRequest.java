package com.my.app.domain.user;

import com.my.app.core.domain.DomainEntity;
import com.my.app.core.domain.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequest implements DomainEntity {

    private final String firstName;
    private final String lastName;

    @Override
    public int compareTo(Entity o) {
        return 0;
    }
}
