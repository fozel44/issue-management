package com.fozel.issuemanagement.repository;

import com.fozel.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue,Long> {
}
