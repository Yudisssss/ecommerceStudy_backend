package com.ecommerce.study.auth.domain.exception;

import com.ecommerce.study.shared.exception.domain.ApplicationException;

public class ResetTokenInvalidOrExpiredException extends ApplicationException {
    public ResetTokenInvalidOrExpiredException() {
        super(401, "Reset token is invalid or expired", "The refresh token is invalid or expired.");
    }
}
