package com.my.app.data.user;

import com.my.app.core.data.FileRepository;
import com.my.app.domain.user.UserId;

public class FIleUserRepository extends FileRepository<UserEntity, UserId> {

    protected FIleUserRepository() {
        super(UserEntity.class);
    }

    @Override
    protected UserId mapOfSrc(Object src) {
        return UserId.of(src);
    }

    @Override
    public UserId getNextId() {
        var allId = findAll().stream().map(UserEntity::getId).sorted().toList();

        var lastId = allId.get(allId.size() - 1);

        return UserId.of(lastId.getValue() + 1);
    }
}
