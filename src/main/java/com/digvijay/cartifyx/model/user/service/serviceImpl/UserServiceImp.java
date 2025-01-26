package com.digvijay.cartifyx.model.user.service.serviceImpl;

import com.digvijay.cartifyx.model.user.mapper.UserMapper;
import com.digvijay.cartifyx.model.user.dto.UserDto;
import com.digvijay.cartifyx.model.user.entity.UserEntity;
import com.digvijay.cartifyx.model.user.repository.UserRepository;
import com.digvijay.cartifyx.model.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public String saveUser(UserDto userDto){
        UserEntity userEntity = userMapper.toUserEntity(userDto);
        UserEntity user = userRepository.save(userEntity);
        log.info("user save  successfully with id: {}", user.getUserId());
        return user.getUserId().toString();
    }




}
