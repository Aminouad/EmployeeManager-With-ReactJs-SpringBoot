package tn.amin.studentManager.Service;

import tn.amin.studentManager.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
