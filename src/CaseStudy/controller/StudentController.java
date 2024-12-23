package CaseStudy.controller;

import CaseStudy.model.entity.Student;
import CaseStudy.model.entity.StudyProcess;
import CaseStudy.model.sevice.IStudentService;
import CaseStudy.model.sevice.IstudyProcesses;
import CaseStudy.model.sevice.implement.StudentService;
import CaseStudy.model.sevice.implement.StudyProcesses;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    private IstudyProcesses studyProcessesService = new StudyProcesses();

    public List<Student> getall() {
        return studentService.getall();
    }

    public void addStudent(Student student) {
        studentService.add(student);
    }

    public void updateStudent(int studentId, Scanner sc) {
        Student studentToUpdate = studentService.findByID(studentId);
        if (studentToUpdate != null) {
            System.out.println("editing student: " + studentToUpdate.getName());
            System.out.println("enter new name");
            String name = sc.nextLine();
            if (!name.isEmpty()) studentToUpdate.setName(name);
            System.out.println();
            System.out.print("Enter new address (leave empty to keep current): ");
            String newAddress = sc.nextLine();
            if (!newAddress.isEmpty()) studentToUpdate.setAddress(newAddress);
            System.out.print("Enter new age (leave empty to keep current): ");
            String ageInput = sc.nextLine();
            if (!ageInput.isEmpty()) studentToUpdate.setAge(Integer.parseInt(ageInput));

            System.out.print("Enter new points (leave empty to keep current): ");
            String pointsInput = sc.nextLine();
            if (!pointsInput.isEmpty()) studentToUpdate.setPoints(Integer.parseInt(pointsInput));
            studentService.update(studentToUpdate, studentId);
            System.out.println("Student information updated successfully.");
        }
    }

    public void deleteStudent(int studentId) {

        studentService.delete(studentId);
    }

    public void viewStudyProcess(int studentId) {
        Student student = studentService.findByID(studentId);
        if (student != null) {
            StudyProcess studyProcess = studyProcessesService.getStudyProcessByStudentId(studentId);
            System.out.println("\n--- Study Process for Student " + studentId + " ---");
            if (studyProcess != null) {
                System.out.println("Enrollment Date: " + studyProcess.getEnrollmentDate());
                System.out.println("Years Studied: " + studyProcess.getYearsStudied());
                System.out.println("Years Remaining for Graduation: " + studyProcess.getYearsRemainingForGraduation());
                System.out.println("On Leave: " + (studyProcess.isOnLeave() ? "Yes" : "No"));
            } else {
                System.out.println("Study process not found.");
            }
        } else {
            System.out.println("Student not found!");
        }
    }


}
