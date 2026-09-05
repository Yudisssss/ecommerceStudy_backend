package com.ecommerce.study.user.infra.entity;

import com.ecommerce.study.shared.entity.BaseAuditEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseAuditEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, unique = true, length = 200)
    private String email;

    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
    private String passwordHash;

    @Column(nullable = false)
    private boolean active = true;
}

