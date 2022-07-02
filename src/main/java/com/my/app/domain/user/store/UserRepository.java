package com.my.app.domain.user.store;

import com.my.app.core.domain.DataRepository;
import com.my.app.data.user.UserEntity;
import com.my.app.domain.user.UserId;

public interface UserRepository extends DataRepository<UserEntity, UserId> {


}
