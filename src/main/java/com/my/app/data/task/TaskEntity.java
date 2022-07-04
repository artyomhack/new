package com.my.app.data.task;

import com.my.app.core.domain.Entity;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskEntity implements Entity<TaskId> {

    private final TaskId id;
    private final String title;
    private final String label;

    public static TaskEntity of (String title, String label) {

    }

    public TaskId getId() {
        return id;
    }
}
