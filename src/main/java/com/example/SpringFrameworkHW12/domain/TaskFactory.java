package com.example.SpringFrameworkHW12.domain;

public class TaskFactory {

    public Task createTask(String name, String description) {
        TaskBuilder builder = new TaskBuilder();
        builder.setName(name).setDescription(description);

        return builder.build();
    }
}
