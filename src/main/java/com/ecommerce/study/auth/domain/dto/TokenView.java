package com.ecommerce.study.auth.domain.dto;

import com.ecommerce.study.user.domain.dto.UserView;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class TokenView {
    private String tokenType;
    private LocalDateTime expiresAt;
    private UserView user;
    private String accessToken;
    private UUID refreshToken;
}
