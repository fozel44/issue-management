package com.fozel.issuemanagement.api;

import com.fozel.issuemanagement.dto.ProjectDto;
import com.fozel.issuemanagement.service.impl.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl) {
        this.projectServiceImpl = projectServiceImpl;
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id",required = true) Long id){
       ProjectDto projectDto= projectServiceImpl.getById(id);
       return ResponseEntity.ok(projectDto);
    }
    @PostMapping()
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto projectDto){
        ProjectDto p= projectServiceImpl.save(projectDto);
        return ResponseEntity.ok(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id",required = true) Long id,@Valid @RequestBody ProjectDto projectDto){
        ProjectDto p= projectServiceImpl.update(id,projectDto);
        return ResponseEntity.ok(p);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProject(@PathVariable(value = "id",required = true) Long id){
        Boolean p= projectServiceImpl.delete(id);
        return ResponseEntity.ok(p);
    }
}
