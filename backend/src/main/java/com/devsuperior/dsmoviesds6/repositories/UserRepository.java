package com.devsuperior.dsmoviesds6.repositories;

import com.devsuperior.dsmoviesds6.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
