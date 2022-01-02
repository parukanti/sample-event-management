package com.sample.project.events.persist.repo;

import com.sample.project.events.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByLogin(String login);

    User findByEmail(String email);

    //@Query("SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(:lastName)")
    //public List<User> find(@Param("lastName") String lastName);

}
