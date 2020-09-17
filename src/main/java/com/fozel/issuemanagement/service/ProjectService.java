package com.fozel.issuemanagement.service;

import com.fozel.issuemanagement.dto.ProjectDto;
import com.fozel.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto projectDto);

    ProjectDto getById(Long id);

    List<ProjectDto> getAllByProjectCode(String projectCode);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getAllByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto projectDto);

    ProjectDto update(Long id,ProjectDto projectDto);

}
