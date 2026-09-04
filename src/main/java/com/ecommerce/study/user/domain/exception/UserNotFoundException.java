package com.ecommerce.study.user.domain.exception;

import com.ecommerce.study.shared.exception.domain.ApplicationException;

public class UserNotFoundException extends ApplicationException {
    public UserNotFoundException(String details) {
        super(404, "User not found", details);
    }
}
