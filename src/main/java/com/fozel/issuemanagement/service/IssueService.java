package com.fozel.issuemanagement.service;

import com.fozel.issuemanagement.dto.IssueDto;
import com.fozel.issuemanagement.entity.Issue;
import com.fozel.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issueDto);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issueDto);
}
