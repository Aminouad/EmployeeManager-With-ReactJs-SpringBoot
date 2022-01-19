package tn.amin.studentManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.amin.studentManager.Repository.StudentRepository;
import tn.amin.studentManager.model.Student;

import java.util.List;

@Service
public class StudentServiceImp implements  StudentService{

   private StudentRepository  studentRepository;
    @Autowired
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
