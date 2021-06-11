package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Haustier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HaustierRepository extends JpaRepository<Haustier, Long> {
}