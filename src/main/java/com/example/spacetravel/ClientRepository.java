package com.example.spacetravel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Object> findById(Long id);
    // Тут можна додати власні методи, якщо потрібно
}
