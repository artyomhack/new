package com.my.app.domain.task;

import com.my.app.core.domain.DomainEntity;
import com.my.app.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements DomainEntity<TaskId> {

    private final TaskId taskId;

    private String title;

    private String label;

    private Iterable<User> users;

    public Task(TaskId taskId, String title, String label) {
        this.taskId = taskId;
        this.title = title;
        this.label = label;
    }

    @Override
    public TaskId getId() {
        return taskId;
    }
}
