package com.my.app.domain.task;

import com.my.app.domain.user.User;
import com.my.app.domain.user.UserRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

public interface Task {

    @Data
    @AllArgsConstructor
    class ListItem implements Task {
        private final String description;
    }
}
