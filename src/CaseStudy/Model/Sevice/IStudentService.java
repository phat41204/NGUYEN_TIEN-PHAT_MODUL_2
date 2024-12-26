package CaseStudy.Model.Sevice;

import CaseStudy.Model.Entity.Student;
import java.util.List;

public interface IStudentService {
    List<Student> getall();

    void add(Student student);

    void delete( int id);

    void update(Student student, int id);

    Student findByID(int id);
}
