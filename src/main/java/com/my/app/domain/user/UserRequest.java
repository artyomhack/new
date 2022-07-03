package com.my.app.domain.user;

import com.my.app.core.domain.DomainEntity;
import com.my.app.core.domain.Entity;
import com.my.app.core.domain.EntityId;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.catalina.User;

@Data
@AllArgsConstructor
public class UserRequest implements DomainEntity {

    private final String firstName;
    private final String lastName;

}
