package com.ecommerce.study.auth.domain.exception;

import com.ecommerce.study.shared.exception.domain.ApplicationException;

public class RefreshTokenInvalidOrExpiredException extends ApplicationException {
    public RefreshTokenInvalidOrExpiredException() {
        super(401, "Refresh token is invalid or expired", "The refresh token is invalid or expired.");
    }
}