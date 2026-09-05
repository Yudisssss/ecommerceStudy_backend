package com.ecommerce.study.user.infra.repository;

import com.ecommerce.study.user.infra.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<UserEntity, UUID> {
}
