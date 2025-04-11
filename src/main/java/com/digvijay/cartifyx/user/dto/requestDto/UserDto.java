package com.digvijay.cartifyx.user.dto.requestDto;

import com.digvijay.cartifyx.comman.constants.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.UniqueElements;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    @NotNull
    @Size(max = 20,min =3,message = "Name should contain min 3 and max 20 char !")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name can only contain alphabetic characters")
    private String userName;

    @Email(message = "Please enter email in proper format!")
    @NotNull(message = "should not be empty")
    private String userEmail;

    @Size(min = 10,max = 10)
    @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must contain exactly 10 digits")
    private String phoneNumber;
    
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole = UserRole.USER_ROLE;
}
