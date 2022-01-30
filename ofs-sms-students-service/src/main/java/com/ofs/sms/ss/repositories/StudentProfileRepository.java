/**
 * 
 */
package com.ofs.sms.ss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofs.sms.ss.entities.StudentProfile;

/**
 * @author Lalitha
 *
 */
@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long>{

}
