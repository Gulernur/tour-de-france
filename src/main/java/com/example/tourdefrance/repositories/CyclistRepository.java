package com.example.tourdefrance.repositories;

import com.example.tourdefrance.entities.Cyclist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CyclistRepository extends JpaRepository<Cyclist, Integer> {
}
