package com.digvijay.cartifyx.user;

import com.digvijay.cartifyx.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,UUID>, PagingAndSortingRepository<UserEntity,UUID> {

}
