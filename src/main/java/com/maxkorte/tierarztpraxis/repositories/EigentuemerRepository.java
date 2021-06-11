package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Eigentuemer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EigentuemerRepository extends JpaRepository<Eigentuemer, Long> {
}