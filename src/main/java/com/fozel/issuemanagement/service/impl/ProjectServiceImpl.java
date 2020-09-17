package com.fozel.issuemanagement.service.impl;

import com.fozel.issuemanagement.dto.ProjectDto;
import com.fozel.issuemanagement.entity.Project;
import com.fozel.issuemanagement.repository.ProjectRepository;
import com.fozel.issuemanagement.service.ProjectService;
import com.fozel.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public ProjectDto save(ProjectDto projectDto) {
        Project projectCheck=projectRepository.getByProjectCode(projectDto.getProjectCode());
        if(projectCheck!=null){
            throw new IllegalArgumentException("Project Code Already Exist");
        }
        Project p = modelMapper.map(projectDto,Project.class);
        p=projectRepository.save(p);
        projectDto.setId(p.getId());
        return projectDto;
    }

    @Override
    public ProjectDto getById(Long id) {
         Project p = projectRepository.getOne(id);
         return modelMapper.map(p,ProjectDto.class);
    }

    @Override
    public List<ProjectDto> getAllByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public ProjectDto getByProjectCode(String projectCode) {
        Project p = projectRepository.getByProjectCode(projectCode);
        return modelMapper.map(p,ProjectDto.class);
    }

    @Override
    public List<ProjectDto> getAllByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public TPage<ProjectDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(ProjectDto projectDto) {
        return null;
    }

    public Boolean delete(Long id) {
        projectRepository.deleteById(id);
        return true;
    }

    @Override
    public ProjectDto update(Long id,ProjectDto projectDto) {
        Project projectDb=projectRepository.getOne(id);
        if(projectDb==null){
            throw new IllegalArgumentException("Project does not exist "+id);
        }
        Project projectCheck=projectRepository.getByProjectCodeAndIdNot(projectDto.getProjectCode(),id);
        if(projectCheck!=null){
            throw new IllegalArgumentException("Project Code Already Exist");
        }
        projectDb.setProjectCode(projectDto.getProjectCode());
        projectDb.setProjectName(projectDto.getProjectName());
        projectRepository.save(projectDb);
        return modelMapper.map(projectDb,ProjectDto.class);

    }

}
