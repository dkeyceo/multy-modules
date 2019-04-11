package com.dkey.dao;

import com.dkey.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Component
public interface UserDao extends JpaRepository<User, Long> {

    List<User> findAll();
    Optional<User> findById(Long id);
}
