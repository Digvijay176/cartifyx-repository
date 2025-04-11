package com.digvijay.cartifyx.user.entity;

import com.digvijay.cartifyx.comman.constants.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user_entity")
@Data
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email",unique = true)
    private String userEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Address> addressList;

    private String password;

    @Column(name="created_when")
    private Timestamp createdWhen;

    public UserEntity() {
        this.userId = UUID.randomUUID();
    }

    public void setCreatedWhen(Timestamp createdWhen) {
        this.createdWhen = createdWhen;
    }
}
