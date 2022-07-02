package com.my.app.domain.task;

import com.my.app.core.domain.DomainEntity;
import com.my.app.core.domain.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TaskRequest implements DomainEntity {

    private final String title;
    private final String label;

    @Override
    public int compareTo(Entity o) {
        return 0;
    }
}
