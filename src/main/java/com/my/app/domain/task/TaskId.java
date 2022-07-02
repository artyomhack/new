package com.my.app.domain.task;

import com.my.app.core.domain.Entity;

public class TaskId extends Entity.IdAsInt {

    public static TaskId empty = new TaskId(emptyValue);


    protected TaskId(Object src) {
        super(src, TaskRequest.class);
    }

    public static TaskId of(Object src) {
        return new TaskId(src);
    }
}
