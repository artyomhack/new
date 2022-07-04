package com.my.app.domain.user;

import com.my.app.core.domain.DomainEntity;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Iterator;

@Data
@AllArgsConstructor
public class User implements DomainEntity<UserId> {

    private final UserId userId;

    private String firstName;

    private String lastName;

    private Iterator<Task> tasks;

    @Override
    public UserId getId() {
        return null;
    }

}
