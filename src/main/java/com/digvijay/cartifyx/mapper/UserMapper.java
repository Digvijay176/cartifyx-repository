package com.digvijay.cartifyx.mapper;

import com.digvijay.cartifyx.dto.request.UserDto;
import com.digvijay.cartifyx.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserMapper {

    public UserEntity toUserEntity(UserDto userDto){

        UserEntity user = new UserEntity();
            user.setUserName(userDto.getUserName());
            user.setUserEmail(userDto.getUserEmail());
            user.setPhoneNumber(userDto.getPhoneNumber());
            user.setUserRole(userDto.getUserRole());
            log.info("converted UserDto to UserEntity");
            return  user;
    }


}
