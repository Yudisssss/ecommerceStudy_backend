package com.ecommerce.study.auth.infra.adapter;

import com.ecommerce.study.auth.application.ports.out.RefreshTokenRepositoryPort;
import com.ecommerce.study.auth.domain.model.RefreshToken;
import com.ecommerce.study.auth.infra.entity.RefreshTokenEntity;
import com.ecommerce.study.auth.infra.repository.JpaRefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class RefreshTokenAdapter implements RefreshTokenRepositoryPort {

    private final JpaRefreshTokenRepository jpa;
    private final ModelMapper modelMapper;

    @Override
    public RefreshToken save(RefreshToken refreshToken) {
        RefreshTokenEntity entity = modelMapper.map(refreshToken, RefreshTokenEntity.class);
        RefreshTokenEntity saved = jpa.save(entity);
        return modelMapper.map(saved, RefreshToken.class);
    }

    @Override
    public Optional<RefreshToken> findByToken(UUID token) {
        return jpa.findByToken(token).map(entity -> modelMapper.map(entity, RefreshToken.class));
    }

    @Override
    public List<RefreshToken> findByUserId(UUID userId) {
        return jpa.findByUserId(userId).stream()
                .map(entity -> modelMapper.map(entity, RefreshToken.class))
                .collect(Collectors.toList());
    }

    @Override
    public void revokeByUserId(UUID userId) {
        jpa.revokeByUserId(userId);
    }

    @Override
    public void deleteByUserId(UUID userId) {
        jpa.deleteByUserId(userId);
    }

    @Override
    public void deleteById(UUID id) {
        jpa.deleteById(id);
    }

}