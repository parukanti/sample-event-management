package com.sample.project.events.persist.repo;

import com.sample.project.events.persist.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<Token, String> {
}
