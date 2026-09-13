package com.ecommerce.study.user.application.port.in.create;

import com.ecommerce.study.user.application.port.out.UserRepositoryPort;
import com.ecommerce.study.user.domain.model.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;



@AllArgsConstructor
public class CreateUserUseCase {

    private final UserRepositoryPort repositoryPort;
    private final ModelMapper modelMapper;


    public CreateUserResponseDTO save(CreateUserRequestDTO dto) {


        User user = new User();
        user.setActive(true);

        CreateUserResponseDTO response;

        return null;
    }
}