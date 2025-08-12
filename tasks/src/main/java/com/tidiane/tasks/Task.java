package com.tidiane.tasks;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id @GeneratedValue private Long taskId;
    private String content;
    private Long userId;
    private Long projectId;

    //empty constructor for the jpa
    Task(){}

    Task(String content){
        this.content = content;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProjectId() {
        return projectId;
    }
} 

