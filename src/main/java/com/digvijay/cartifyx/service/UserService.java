package com.digvijay.cartifyx.service;

import com.digvijay.cartifyx.dto.request.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String saveUser(UserDto userDto);

}
