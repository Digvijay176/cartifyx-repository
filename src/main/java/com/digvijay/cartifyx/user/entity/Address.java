package com.digvijay.cartifyx.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @Column(name="address_id")
    private UUID addressId;
    @Column(name="home_no")
    private String homeNo;
    private String street;
    private String city;
    private String district;
    private String state;
    private Long pinCode;

    public Address(){
        this.addressId= UUID.randomUUID();
    }
}
