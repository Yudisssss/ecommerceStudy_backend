package com.ecommerce.study.auth.infra.repository;

import aj.org.objectweb.asm.commons.Remapper;
import com.ecommerce.study.auth.infra.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface JpaRefreshTokenRepository extends JpaRepository<RefreshTokenEntity, UUID> {
    Optional<RefreshTokenEntity> findByToken(UUID token);
    List<RefreshTokenEntity> findByUserId(@Param("userId") UUID userId);
    void revokeByUserId(@Param("userId") UUID userId);
    void deleteByUserId(@Param("userId") UUID userId);

}
