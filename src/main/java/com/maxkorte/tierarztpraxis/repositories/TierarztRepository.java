package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Tierarzt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TierarztRepository extends JpaRepository<Tierarzt, Long> {
}