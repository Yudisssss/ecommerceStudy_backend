package com.ecommerce.study.user.domain.exception;

import com.ecommerce.study.shared.exception.domain.ApplicationException;

public class UserNotActiveException extends ApplicationException {
    public UserNotActiveException() {
        super(401, "User not active", "The user is not active");
    }
}