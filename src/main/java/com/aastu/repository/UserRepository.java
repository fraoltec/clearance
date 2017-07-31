package com.aastu.repository;

import com.aastu.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Abdurahman on 7/31/2017.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Long>{
}
