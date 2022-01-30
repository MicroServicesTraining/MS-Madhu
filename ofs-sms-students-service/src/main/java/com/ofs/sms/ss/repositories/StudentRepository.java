/**
 * 
 */
package com.ofs.sms.ss.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ofs.sms.ss.entities.Student;

/**
 * @author USER
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	/* JPQL 
	//@Query(value="select s from Student s where s.fee > ?1") -- Positional Parameters
	@Query(value="select s from Student s where s.fee > :fee") // named parameters
	Optional<List<Student>> getStudentsByFee(@Param(value = "fee") Double fee);

	//@Query(value="select s from Student s where s.fee > ?1 and s.fee < ?2") -- Positional Parameters
	@Query(value="select s from Student s where s.fee > :minfee and s.fee < :maxfee") // Named parameters
	Optional<List<Student>> getStudentsByFeeRange(@Param(value = "minfee") Double minfee, @Param(value = "maxfee") Double maxfee);
	*/
	/**
	 * Native SQL
	 */
//	@Query(value="select * from students s where s.fee > ?1", nativeQuery = true) //-- Positional Parameters
	//@Query(value="select * from students  where fee > :fee", nativeQuery = true) // named parameters
	//Optional<List<Student>> getStudentsByFee(@Param(value = "fee") Double fee);

	//@Query(value="select s.* from students s where s.fee > ?1 and s.fee < ?2", nativeQuery = true) //-- Positional Parameters
	//@Query(value="select s.* from students s where s.fee > :minfee and s.fee < :maxfee", nativeQuery = true) // Named parameters
	//Optional<List<Student>> getStudentsByFeeRange(@Param(value = "minfee") Double minfee, @Param(value = "maxfee") Double maxfee);
	
	Optional<List<Student>> getStudentsByFee(@Param(value = "fee") Double fee);
	Optional<List<Student>> getStudentsByFeeRange(@Param(value = "minfee") Double minfee, @Param(value = "maxfee") Double maxfee);
}
