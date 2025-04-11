package com.digvijay.cartifyx.user.service;

import com.digvijay.cartifyx.user.dto.requestDto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String saveUser(UserDto userDto);

    String registerUser(UserDto request);
}
