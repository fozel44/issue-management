package com.fozel.issuemanagement.service.impl;

import com.fozel.issuemanagement.dto.ProjectDto;
import com.fozel.issuemanagement.repository.ProjectRepository;
import com.fozel.issuemanagement.service.ProjectService;
import com.fozel.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public ProjectDto save(ProjectDto projectDto) {
        return null;
    }

    @Override
    public ProjectDto getById(Long id) {
        return null;
    }

    @Override
    public List<ProjectDto> getAllByProjectCode(String projectCode) {
        return null;
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
}
