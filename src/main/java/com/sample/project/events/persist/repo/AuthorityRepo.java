package com.sample.project.events.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.project.events.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {
    Authority findByName(String name);
}