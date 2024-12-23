package CaseStudy.model.sevice.implement;

import CaseStudy.model.entity.Student;
import CaseStudy.model.repository.StudentRepository;
import CaseStudy.model.sevice.IStudentService;
import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentrepository = new StudentRepository();
    @Override
    public List<Student> getall() {
        return studentrepository.Findall();
    }

    @Override
    public void add(Student student) {
studentrepository.add(student);
    }

    @Override
    public void delete( int id) {
studentrepository.delete(id);
    }

    @Override
    public void update(Student student, int id) {
studentrepository.update(student, id);
    }

    @Override
    public Student findByID(int id) {

        return studentrepository.Findbyid(id);
    }

}
