package com.my.app.domain.user;

import com.my.app.domain.task.TaskId;

import java.util.List;

public class UserServiceImpl implements UserService{



    @Override
    public UserId add(String firstName, String lastName) {
        return null;
    }

    @Override
    public UserId update(UserId userId, String firstName, String lastName) {
        return null;
    }

    @Override
    public boolean deleteById(UserId userId) {
        return false;
    }

    @Override
    public void addTask(UserId userId, TaskId taskId) {

    }

    @Override
    public User findById(UserId userId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
