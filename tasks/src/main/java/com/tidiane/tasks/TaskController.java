package com.tidiane.tasks;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired TaskRepository taskRepository;

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @GetMapping("/all")
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @GetMapping("/project/{projectId}")
    public List<Task> getAllProjectTasks(@PathVariable Long userId, @PathVariable Long projectId){
        return taskRepository.findByUserIdAndProjectId(userId, projectId);
    }
    
}