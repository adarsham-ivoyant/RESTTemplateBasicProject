package com.ivoyant.UserService.service;

import com.ivoyant.UserService.dto.ResponseDto;
import com.ivoyant.UserService.entity.User;
import org.springframework.stereotype.Service;

//@Service
public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
