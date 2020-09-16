package com.fozel.issuemanagement.repository;

import com.fozel.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> getAllByProjectCode(String projectCode);
    List<Project> getAllByProjectCodeContains(String projectCode);

    List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);
    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode,String ProjectName);

    //Page<Project> findAll(Pageable pageable);
    List<Project> findAll(Sort sort);

}
