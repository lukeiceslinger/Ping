package com.flibustier.springjava.ping.Repository;

import com.flibustier.springjava.ping.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
