package com.digvijay.cartifyx.user.service.serviceImpl;

import com.digvijay.cartifyx.user.dto.requestDto.UserDto;
import com.digvijay.cartifyx.user.entity.UserEntity;
import com.digvijay.cartifyx.user.UserRepository;
import com.digvijay.cartifyx.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
@Slf4j
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String saveUser(UserDto userDto){
        UserEntity userEntity = modelMapper.map(userDto,UserEntity.class);
        userEntity.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userEntity.setCreatedWhen(Timestamp.valueOf(LocalDateTime.now()));
        UserEntity user = userRepository.save(userEntity);
        return null;
    }

}
