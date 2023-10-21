package com.example.spacetravel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, String> {
    // Тут можна додати власні методи, якщо потрібно
}