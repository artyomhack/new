package com.my.app.domain.task.store;


import com.my.app.core.domain.DataRepository;
import com.my.app.data.task.TaskEntity;
import com.my.app.domain.task.TaskId;

public interface TaskRepository extends DataRepository<TaskEntity, TaskId> {


}
