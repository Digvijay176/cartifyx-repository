package com.digvijay.cartifyx.service.serviceImpl;

import com.digvijay.cartifyx.mapper.UserMapper;
import com.digvijay.cartifyx.dto.request.UserDto;
import com.digvijay.cartifyx.entity.UserEntity;
import com.digvijay.cartifyx.repository.UserRepository;
import com.digvijay.cartifyx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

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
        userEntity.setCreatedWhen(Timestamp.valueOf(LocalDateTime.now()));
        UserEntity user = userRepository.save(userEntity);
        log.info("user save  successfully with id: {}", user.getUserId());
        return user.getUserId().toString();
    }




}
