package com.ecommerce.study.user.application.port.in.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateUserRequestDTO {
    private String name;
    private String email;
    private String password;
}
