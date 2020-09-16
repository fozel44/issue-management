package com.fozel.issuemanagement.repository;

import com.fozel.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
