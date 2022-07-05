package com.my.app.data.task;

import com.my.app.core.domain.Entity;
import com.my.app.data.user.UserEntity;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.task.TaskListItem;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class TaskEntity implements Entity<TaskId> {

    private final TaskId id;
    private final String title;
    private final String label;
    private final Iterable<TaskListItem> users;

    public static TaskEntity of (Task task) {
        return new TaskEntity(
                task.getId(),
                task.getTitle(),
                task.getLabel(),
                new ArrayList<>()
        );
    }

    public Task

    public TaskId getId() {
        return id;
    }
}
