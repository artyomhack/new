package com.my.app.domain.task.store;

import com.my.app.data.task.TaskEntity;
import com.my.app.data.user.UserEntity;
import com.my.app.domain.DomainException;
import com.my.app.domain.task.Task;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.task.TaskRequest;
import com.my.app.domain.user.UserRequest;
import com.my.app.domain.user.store.UserRepository;

import java.util.List;
import java.util.Optional;

public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public TaskServiceImpl(TaskRepository repository, UserRepository userRepository) {
        this.taskRepository = repository;
        this.userRepository = userRepository;
    }

    @Override
    public TaskEntity create(TaskRequest task) throws DomainException {
        var entity = TaskEntity.of(task);
        taskRepository.save(entity);
        return entity;
    }

    @Override
    public TaskEntity update(TaskId id, TaskRequest task) throws DomainException {
        return Optional.of(taskRepository.findById(id)).map(it -> {
            var title = Optional.of(task.getTitle()).orElse(it.getTitle());
            var label = Optional.of(task.getLabel()).orElse(it.getLabel());

            return new TaskEntity(id, title, label);

        }).orElse(null);
    }

    @Override
    public TaskEntity findById(TaskId id) throws DomainException {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task.ListItem> findAll() throws DomainException {
        return taskRepository.findAll()
                         .stream()
                         .map(TaskEntity::toItem).toList();
    }

    @Override
    public boolean deleteById(TaskId id) throws DomainException {
        return taskRepository.deleteById(id);
    }

    @Override
    public TaskEntity addUserToTask(TaskId id, UserRequest request) throws DomainException {
        var entity = taskRepository.findById(id);
        entity.add(userRepository.save(UserEntity.of(request)));
        return taskRepository.save(entity);
    }
}
