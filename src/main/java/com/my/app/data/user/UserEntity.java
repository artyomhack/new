package com.my.app.data.user;

import com.my.app.core.domain.Entity;
import com.my.app.domain.user.UserId;
import com.my.app.domain.user.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity implements Entity<UserId> {

    private final UserId userId;
    private final String firstName;
    private final String lastName;


    public static UserEntity of(UserRequest request) {
        return new UserEntity(
                UserId.empty,
                request.getFirstName(),
                request.getLastName()
        );
    }

    @Override
    public UserId getId() {
        return userId;
    }
}
