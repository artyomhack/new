package com.my.app.domain.user.store;


import com.my.app.data.user.UserEntity;
import com.my.app.domain.DomainException;
import com.my.app.domain.task.TaskRequest;
import com.my.app.domain.task.store.TaskRepository;
import com.my.app.domain.user.User;
import com.my.app.domain.user.UserId;
import com.my.app.domain.user.UserRequest;

import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    public UserServiceImpl(UserRepository repository, TaskRepository taskRepository) {
        this.userRepository = repository;
        this.taskRepository = taskRepository;
    }

    @Override
    public User.Data create(UserRequest user) throws DomainException {
        return userRepository.save(UserEntity.of(user)).toDetails();
    }

    @Override
    public User.Data findById(UserId id) throws DomainException {
        return userRepository.findById(id).toDetails();
    }

    @Override
    public List<User.ListItem> findAll() throws DomainException {
        return userRepository.findAll()
                .stream()
                .map(UserEntity::toItem).toList();
    }

    @Override
    public boolean deleteById(UserId id) throws DomainException {
        return userRepository.deleteById(id);
    }

    @Override
    public User.Data addTaskToUser(UserId userId, TaskRequest request) throws DomainException {

    }
}

