package com.ecommerce.study.auth.infra.adapter;

import com.ecommerce.study.auth.application.ports.out.ResetTokenRepositoryPort;
import com.ecommerce.study.auth.domain.model.ResetToken;
import com.ecommerce.study.auth.infra.entity.ResetTokenEntity;
import com.ecommerce.study.auth.infra.repository.JpaResetTokenRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ResetTokenAdapter implements ResetTokenRepositoryPort {
    private final JpaResetTokenRepository jpaResetTokenRepository;
    private final ModelMapper modelMapper;

    @Override
    public Optional<ResetToken> findById(UUID tokenId) {
        return jpaResetTokenRepository.findById(tokenId).map(
                e -> modelMapper.map(e, ResetToken.class)
        );
    }

    @Override
    public ResetToken save(ResetToken token) {
        ResetTokenEntity entity = jpaResetTokenRepository.findById(token.getId())
                .map(existing -> {
                    modelMapper.map(token, existing);
                    return existing;
                })
                .orElseGet(() -> modelMapper.map(token, ResetTokenEntity.class));
        ResetTokenEntity saved = jpaResetTokenRepository.save(entity);
        return modelMapper.map(saved, ResetToken.class);
    }
}
