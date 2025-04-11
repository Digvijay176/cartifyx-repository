package com.digvijay.cartifyx.user.controller;

import com.digvijay.cartifyx.comman.handler.ResponseDto;
import com.digvijay.cartifyx.user.dto.requestDto.UserDto;
import com.digvijay.cartifyx.user.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@JsonIgnoreProperties
@RequestMapping("/api/cartifyx")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<ResponseDto<?>> registerResponse(@Valid @ModelAttribute UserDto userDto){
        String message = userService.registerUser(userDto);
        ResponseDto<UserDto> responseDto = new ResponseDto<UserDto>();
        responseDto.setData(null);
        responseDto.setMessage(message);
        responseDto.setStatus(HttpStatus.ACCEPTED.value());
        return ResponseEntity.ok().body(responseDto);
    }
}
