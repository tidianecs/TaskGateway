package com.tidiane.projects;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired ProjectRepository projectRepository;
    @Autowired JwtService jwtService;

    @PostMapping
    public Project creaProject(@RequestBody Project project){
        return projectRepository.save(project);
    }

    @GetMapping("/all")
    public List<Project> getAllUserProjects(){
        String userId = jwtService.getConnectedUserId();
        return projectRepository.findByUserId(userId);
    }
}
