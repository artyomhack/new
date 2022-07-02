package com.my.app.data.task;

import com.my.app.core.data.FileRepository;
import com.my.app.domain.task.TaskId;

public class FileTaskRepository extends FileRepository<TaskEntity, TaskId> {

    protected FileTaskRepository(Class<TaskEntity> entity) {
        super(entity);
    }


    @Override
    protected TaskId mapOfSrc(Object src) {
        return null;
    }
}
