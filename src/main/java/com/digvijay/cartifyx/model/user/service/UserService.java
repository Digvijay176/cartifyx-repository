package com.digvijay.cartifyx.model.user.service;

import com.digvijay.cartifyx.model.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String saveUser(UserDto userDto);

}
