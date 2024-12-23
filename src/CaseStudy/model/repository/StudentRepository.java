package CaseStudy.model.repository;

import CaseStudy.model.entity.Student;
import CaseStudy.model.entity.StudyProcess;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(0, "nguyen phat", "hue", 21, "male", 8));
        students.add(new Student(1, "nguyen phat", "hue", 21, "male", 8));
        students.add(new Student(2, "nguyen phat", "hue", 21, "male", 8));
    }

    private static List<StudyProcess> studyProcesses = new ArrayList<>();

    static {
        studyProcesses.add(new StudyProcess(LocalDate.of(2020, 9, 1), false)); // Sinh viên 0
        studyProcesses.add(new StudyProcess(LocalDate.of(2021, 9, 1), false)); // Sinh viên 1
        studyProcesses.add(new StudyProcess(LocalDate.of(2019, 9, 1), true));  // Sinh viên 2

    }

    public List<Student> Findall() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    public Student Findbyid(int id) {
        for (Student student : students) {
            if (student.getCode() == id) {
                return student;
            }
        }
        return null;
    }

    public void update(Student student, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == id) {
                students.get(i).setName(student.getName());
                students.get(i).setAddress(student.getAddress());
                students.get(i).setAge(student.getAge());
                students.get(i).setGender(student.getGender());
                students.get(i).setPoints(student.getPoints());
                students.get(i).setStudyProcess(student.getStudyProcess());
                return;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == id) {
                students.remove(i);
                studyProcesses.remove(i);
                return;
            }
        }
        System.out.println("Student not found");
    }

    public List<StudyProcess> findAllStudyProcesses() {
        return studyProcesses;
    }
    public void addStudyProcess(StudyProcess studyProcess) {
        studyProcesses.add(studyProcess);
    }
    public StudyProcess findStudyProcessByStudentId(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == studentId) {
                return studyProcesses.get(i);
            }
        }
        return null;
    }

    public void updateStudyProcess(int studentId, StudyProcess studyProcess) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == studentId) {
                studyProcesses.set(i, studyProcess);
                return;
            }
        }
    }
}