package com.my.app.data.user;

import com.my.app.core.data.FileRepository;
import com.my.app.domain.user.UserId;

public class FIleUserRepository extends FileRepository<UserEntity, UserId> {

    protected FIleUserRepository(Class<UserEntity> entityClass) {
        super(entityClass);
    }

    @Override
    protected UserId mapOfSrc(Object src) {
        return null;
    }


}
