package tn.amin.studentManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.amin.studentManager.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
