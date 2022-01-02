package com.sample.project.events.persist.repo;

import com.sample.project.events.persist.entity.User;
import com.sample.project.events.persist.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepo extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);
}