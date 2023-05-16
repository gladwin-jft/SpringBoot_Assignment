package com.project.controller;

import com.project.Dto.StudentDto;
import com.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController/*@RestController is used to create controllers for REST APIs which can return JSON.*/
public class StudentController
{

    @Autowired/* student Service class contains all the Business Logic that  */
    StudentService studentService;/*is being used by the StudentController*/

    @GetMapping("/Get/Students")
    public List<StudentDto> getStudents()
    {
        /*getStudents sends back a List of StudentDtos to the View Controller */
        return studentService.getAllStudents();
    }

}
