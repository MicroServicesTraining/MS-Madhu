/**
 * 
 */
package com.ofs.sms.ss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofs.sms.ss.entities.Student;

/**
 * @author USER
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
