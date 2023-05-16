package com.project.respository;

import com.project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/*@Repository is a derivative of @Component, @Component scan registers it as a Spring Bean*/
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
