package com.my.app.domain.task;

import com.my.app.core.domain.DomainEntity;
import com.my.app.data.task.TaskEntity;
import com.my.app.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements DomainEntity<TaskId> {

    /**
     * TaskDetails
     */

    private final TaskId taskId;

    private String title;

    private String label;

    public Task(TaskId taskId, String title, String label) {
        this.taskId = taskId;
        this.title = title;
        this.label = label;
    }

    public static Task taskOf(String title, String label) {
        return new Task(
                TaskId.empty,
                title,
                label
        );
    }

    @Override
    public TaskId getId() {
        return taskId;
    }
}
