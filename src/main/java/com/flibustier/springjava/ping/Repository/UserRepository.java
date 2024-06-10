package com.flibustier.springjava.ping.Repository;

import com.flibustier.springjava.ping.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findUsername(String username);
    Optional<UserEntity> findByEmail(String email);
}
