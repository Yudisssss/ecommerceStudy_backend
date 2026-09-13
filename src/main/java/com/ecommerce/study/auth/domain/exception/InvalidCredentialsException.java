package com.ecommerce.study.auth.domain.exception;

import com.ecommerce.study.shared.exception.domain.ApplicationException;

public class InvalidCredentialsException extends ApplicationException {
    public InvalidCredentialsException() {
        super(401, "Invalid credentials", "The nickname or password you entered is incorrect");
    }

}
