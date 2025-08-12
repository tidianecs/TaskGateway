package com.tidiane.projects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id @GeneratedValue private Long projectId;
    private String projectName;
    private String projectDesc;
    private String userId;

    //Empty constructo for JPA
    Project(){}
    
    Project(String projectName, String projectDesc){
        this.projectName = projectName;
        this.projectDesc = projectDesc;
    }

    public Long getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPojectDesc() {
        return projectDesc;
    }

    public void setPojectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
