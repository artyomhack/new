package com.my.app.domain.user.store;

import com.my.app.data.user.UserEntity;
import com.my.app.domain.DomainException;
import com.my.app.domain.task.TaskRequest;
import com.my.app.domain.user.User;
import com.my.app.domain.user.UserId;
import com.my.app.domain.user.UserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User.Data create(UserRequest user) throws DomainException;

    User.Data findById(UserId id) throws DomainException;

    List<User.ListItem> findAll() throws DomainException;

    boolean deleteById(UserId id) throws DomainException;

    User.Data addTaskToUser(UserId userId, TaskRequest request) throws DomainException;
}
