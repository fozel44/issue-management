package com.fozel.issuemanagement.service.impl;

import com.fozel.issuemanagement.dto.UserDto;
import com.fozel.issuemanagement.entity.User;
import com.fozel.issuemanagement.repository.UserRepository;
import com.fozel.issuemanagement.service.UserService;
import com.fozel.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDto save(User user) {
        return null;
    }

    @Override
    public UserDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<UserDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public UserDto getByUsername(String username) {
        return null;
    }
}
