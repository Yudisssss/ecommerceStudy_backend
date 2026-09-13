package com.ecommerce.study.auth.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class ResetToken {
    private UUID id;
    private UUID userId;
    private LocalDateTime expiresAt;
    private boolean revoked;
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
