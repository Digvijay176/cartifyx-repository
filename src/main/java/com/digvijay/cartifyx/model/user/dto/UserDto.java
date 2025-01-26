package com.digvijay.cartifyx.model.user.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.UUID;
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotNull
    @Size(max = 20,min =3,message = "Name should contain min 3 and max 20 char !")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name can only contain alphabetic characters")
    private String userName;

    @Email(message = "Please enter email in proper format!")
    @NotNull(message = "should not be empty")
    @UniqueElements( message = "Please register with another email !")
    private String userEmail;

    @Size(min = 10,max = 10)
    @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must contain exactly 10 digits")
    private String phoneNumber;

    private String userRole;
}
