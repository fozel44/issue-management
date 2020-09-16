package com.fozel.issuemanagement.service;

import com.fozel.issuemanagement.dto.UserDto;
import com.fozel.issuemanagement.entity.IssueHistory;
import com.fozel.issuemanagement.entity.User;
import com.fozel.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(User user);
    UserDto getById(Long id);
    TPage<UserDto> getAllPageable(Pageable pageable);
    UserDto getByUsername(String username);
}
