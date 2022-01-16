package com.devsuperior.dsmoviesds6.repositories;

import com.devsuperior.dsmoviesds6.entities.Score;
import com.devsuperior.dsmoviesds6.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
