package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Tierart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TierartRepository extends JpaRepository<Tierart, Long> {
}