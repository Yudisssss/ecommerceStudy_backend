package com.ecommerce.study.auth.infra.repository;

import com.ecommerce.study.auth.infra.entity.ResetTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaResetTokenRepository extends JpaRepository<ResetTokenEntity, UUID> {
}
