package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Spezialisierung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpezialisierungRepository extends JpaRepository<Spezialisierung, Long> {
}