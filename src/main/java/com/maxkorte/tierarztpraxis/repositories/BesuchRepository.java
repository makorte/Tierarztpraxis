package com.maxkorte.tierarztpraxis.repositories;

import com.maxkorte.tierarztpraxis.model.Besuch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BesuchRepository extends JpaRepository<Besuch, Long> {
}