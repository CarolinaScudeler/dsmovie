package com.devsuperior.dsmoviesds6.repositories;

import com.devsuperior.dsmoviesds6.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
