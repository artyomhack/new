package com.my.app.data.task;

import com.my.app.core.data.FileEntityRepository;
import com.my.app.domain.task.TaskId;

public class FileTaskRepository extends FileEntityRepository<TaskEntity, TaskId> {

    protected FileTaskRepository() {
        super(TaskEntity.class);
    }


    @Override
    protected TaskId mapOfSrc(Object src) {
        return TaskId.of(src);
    }

    @Override
    public TaskId getNextId() {
        var allTaskId = findAll().stream().map(TaskEntity::getId).sorted().toList();

        var lastId = allTaskId.get(allTaskId.size() - 1);

        return TaskId.of(lastId.getValue() + 1);
    }
}
