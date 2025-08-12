package com.tidiane.tasks;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserIdAndProjectId(Long userId, Long projectId);
    
}