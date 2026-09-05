package com.ecommerce.study.user.application.port.out;

import com.ecommerce.study.user.domain.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    void deleteById(UUID id);
    boolean existsByEmail(String email);
}
