package com.aastu.repository;

import com.aastu.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Fraol on 8/17/2017.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
    void deleteUsersByUserId(Integer id);

}