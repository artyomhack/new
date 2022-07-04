package com.my.app.domain.task;

import com.my.app.data.task.FileTaskRepository;
import com.my.app.data.task.TaskEntity;
import com.my.app.data.task_user.FileTaskUserRelRepository;
import com.my.app.data.user.FIleUserRepository;
import com.my.app.domain.user.UserId;

import java.util.List;

public class TaskServiceImpl implements TaskService{

    private final FileTaskRepository taskRepository;
    private final FIleUserRepository userRepository;
    private final FileTaskUserRelRepository relRepository;

    public TaskServiceImpl(FileTaskRepository taskRepository, FIleUserRepository userRepository, FileTaskUserRelRepository relRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
        this.relRepository = relRepository;
    }

    @Override
    public TaskId add(String title, String label) {

        var task = taskRepository.save();

    }

    @Override
    public TaskId update(TaskId taskId, String title, String label) {
        return null;
    }

    @Override
    public boolean deleteById(TaskId taskId) {
        return false;
    }

    @Override
    public void addUser(TaskId taskId, UserId userId) {

    }

    @Override
    public Task findById(TaskId taskId) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return null;
    }
}
