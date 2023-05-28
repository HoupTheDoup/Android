package com.example.stefantodo.Models;

public class ToDoModel extends TaskId{
    private String task , due;
    private int status, isDone;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }

    public int getIsDone() {
        return isDone;
    }


}
