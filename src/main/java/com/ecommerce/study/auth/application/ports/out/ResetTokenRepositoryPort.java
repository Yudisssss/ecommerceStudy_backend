package com.ecommerce.study.auth.application.ports.out;

import com.ecommerce.study.auth.domain.model.ResetToken;

import java.util.Optional;
import java.util.UUID;

public interface ResetTokenRepositoryPort {
    Optional<ResetToken> findById (UUID tokenId);
    ResetToken save (ResetToken tokenHash);
}
