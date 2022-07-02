package com.my.app.domain.task.store;

import com.my.app.data.task.TaskEntity;
import com.my.app.data.user.UserEntity;
import com.my.app.domain.DomainException;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.task.TaskRequest;
import com.my.app.domain.user.UserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    TaskEntity create(TaskRequest task) throws DomainException;

    TaskEntity update(TaskId id, TaskRequest task) throws DomainException;

    TaskEntity findById(TaskId id) throws DomainException;

    List<Task.ListItem> findAll() throws DomainException;

    boolean deleteById(TaskId id) throws DomainException;

    TaskEntity addUserToTask(TaskId taskId, UserRequest request) throws DomainException;

}
