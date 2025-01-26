package com.digvijay.cartifyx.model.user.Controller;

import com.digvijay.cartifyx.comman.exception.ResponseDto;
import com.digvijay.cartifyx.model.user.dto.UserDto;
import com.digvijay.cartifyx.model.user.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@JsonIgnoreProperties
@RequestMapping("/public/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/saveUser",consumes="application/json",produces = "application/json")
    public ResponseEntity<ResponseDto<?>> saveUser(@RequestBody UserDto userDto){
        String result= userService.saveUser(userDto);
        ResponseDto<?> dto = new ResponseDto<>();
        dto.setData(null);
        dto.setMessage("user save successfully with id : " + result);
        dto.setStatus(HttpStatus.OK.value());

        return  ResponseEntity.ok().body(dto);
    }

}
