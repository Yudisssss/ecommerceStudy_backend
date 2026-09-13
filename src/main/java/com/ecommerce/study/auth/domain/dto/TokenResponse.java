package com.ecommerce.study.auth.domain.dto;

import com.ecommerce.study.user.domain.dto.UserView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenResponse {
    private String tokenType;
    private LocalDateTime expiresAt;
    private UserView user;
    private String accessToken;
}
