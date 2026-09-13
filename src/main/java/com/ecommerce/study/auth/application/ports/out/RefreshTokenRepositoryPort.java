package com.ecommerce.study.auth.application.ports.out;

import com.ecommerce.study.auth.domain.model.RefreshToken;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RefreshTokenRepositoryPort {
    RefreshToken save(RefreshToken refreshToken);
    Optional<RefreshToken> findByToken(UUID token);
    List<RefreshToken> findByUserId(UUID userId);
    void revokeByUserId(UUID userId);
    void deleteByUserId(UUID userId);
    void deleteById(UUID id);
}
