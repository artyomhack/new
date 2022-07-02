package com.my.app.data.task;

import com.my.app.core.domain.Entity;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.task.TaskRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskEntity implements Entity {

    private final TaskId id;
    private final String title;
    private final String label;


    @Override
    public int compareTo(Entity o) {
        return 0;
    }

    public static TaskEntity of(TaskRequest request) {
        return new TaskEntity(TaskId.empty, request.getTitle(), request.getLabel());
    }


    public Task.ListItem toItem() {
        var description = getTitle() + ":" + getLabel();
        return new Task.ListItem(description);
    }

}
