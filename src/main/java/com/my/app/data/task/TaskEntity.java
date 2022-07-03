package com.my.app.data.task;

import com.my.app.core.domain.Entity;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.task.TaskRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskEntity implements Entity<TaskId> {

    private final TaskId id;
    private final String title;
    private final String label;

    public static TaskEntity of(TaskRequest request) {
        return new TaskEntity(TaskId.empty, request.getTitle(), request.getLabel());
    }

    public TaskId getId() {
        return id;
    }
}
