package com.example.demo8.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo8.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    // @Query("select u from users where u.name = :name")
    // User findByName(@Param("name") String name);
    
}
