package com.digvijay.cartifyx.model.user.mapper;

import com.digvijay.cartifyx.model.user.dto.UserDto;
import com.digvijay.cartifyx.model.user.entity.UserEntity;
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
