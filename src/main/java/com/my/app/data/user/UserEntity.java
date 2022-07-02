package com.my.app.data.user;

import com.my.app.core.domain.Entity;
import com.my.app.domain.user.User;
import com.my.app.domain.user.UserId;
import com.my.app.domain.user.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity implements Entity {

    private final UserId userId;
    private final String firstName;
    private final String lastName;

    @Override
    public int compareTo(Entity o) {
        return 0;
    }

    public static UserEntity of(UserRequest request) {
        return new UserEntity(
                UserId.empty,
                request.getFirstName(),
                request.getLastName()
        );
    }

    public User.Data toDetails () {
        return new User.Data(
                getFirstName(),
                getLastName()
        );
    }

    public User.ListItem toItem() {
        var fullName = getFirstName() + " " + getLastName();
        return new User.ListItem(fullName);
    }

}
