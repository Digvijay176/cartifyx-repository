package com.digvijay.cartifyx.model.user.entity;

import com.digvijay.cartifyx.comman.constants.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "user_entity")
@Slf4j
@AllArgsConstructor
@Data
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column(name="created_when")
    private Timestamp createdWhen;

    public UserEntity() {
        this.userId = UUID.randomUUID();
    }
}
