package com.ecommerce.study.auth.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class RefreshToken {
    private UUID refreshTokenId;
    private UUID token;
    private boolean revoked;
    private LocalDateTime expiresAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
