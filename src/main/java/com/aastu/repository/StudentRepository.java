package com.aastu.repository;

import com.aastu.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Abdurahman on 7/31/2017.
 */
@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long>{
}
