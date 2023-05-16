package com.project.service;

import com.project.Dto.StudentDto;
import com.project.entity.Student;
import com.project.respository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service/*Student Service acts as an interface for Student Controller, in studentService Business Logic is stored*/
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModelMapper modelMapper;
    public List<StudentDto> getAllStudents()
    {
        List<Student> students = studentRepository.findAll();

        List<StudentDto> studentDtos = students.stream()
                .map(student -> modelMapper.map(student, StudentDto.class))
                .collect(Collectors.toList());
        return studentDtos;
    }
}
