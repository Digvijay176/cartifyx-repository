package com.digvijay.cartifyx.model.user.repository;

import com.digvijay.cartifyx.model.user.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,UUID>, PagingAndSortingRepository<UserEntity,UUID> {

}
