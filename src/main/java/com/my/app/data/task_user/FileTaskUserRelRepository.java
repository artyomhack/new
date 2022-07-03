package com.my.app.data.task_user;

import com.my.app.core.data.RelationFileRepository;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.user.UserId;

import java.util.List;

public class FileTaskUserRelRepository extends RelationFileRepository<TaskId, UserId> {

    protected FileTaskUserRelRepository(Class<TaskId> mainIdClass, Class<UserId> relateIdClass) {
        super(mainIdClass, relateIdClass);
    }

    

    @Override
    protected UserId mapRelateIdFromString(String relateId) {
        return UserId.of(relateId);
    }

    @Override
    protected TaskId mapMainIdFromString(String mainId) {
        return TaskId.of(mainId);
    }
}
