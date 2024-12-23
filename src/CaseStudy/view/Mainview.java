package CaseStudy.view;

import CaseStudy.controller.StudentController;
import CaseStudy.model.entity.Student;

import java.util.List;
import java.util.Scanner;

public class Mainview {
    public static void main(String[] args) {
        MenuStudent();

    }

    public static void MenuStudent() {
        StudentController studentController = new StudentController();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(" Menu Student");
                System.out.println("1. Add Student");
                System.out.println("2. Show list");
                System.out.println("3. Edit Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Show Study Process");
                System.out.println("6. Return main menu");
                System.out.println("Enter your choice");
                int choice = Integer.parseInt(sc.nextLine());
                sc.nextLine();
                switch (choice) {
                    case 1:
                        try {
                            System.out.println("Enter Student ID");
                            int id = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter student name:");
                            String name = sc.nextLine();
                            System.out.println("Enter student address:");
                            String address = sc.nextLine();
                            System.out.println("Enter student age:");
                            int age = Integer.parseInt(sc.nextLine());
                            System.out.println("Enter student gender:");
                            String gender = sc.nextLine();
                            System.out.println("Enter student points:");
                            int points = Integer.parseInt(sc.nextLine());
                            Student Newstudent = new Student(id, name, address, age, gender, points);
                            studentController.addStudent(Newstudent);
                            System.out.println("Student added");
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input");
                        }
                        break;
                    case 2:
                        List<Student> students = studentController.getall();
                        for (Student student : students) {
                            System.out.println(student);
                        }
                        break;
                    case 3:
                        editStudent(sc, studentController);
                        break;
                    case 4:
                        List<Student> studentTodelet = studentController.getall();
                        for (Student student : studentTodelet) {
                            System.out.println(student);
                        }
                        System.out.println("Enter student ID you want to delete");
                        int studentID = Integer.parseInt(sc.nextLine());
                        studentController.deleteStudent(studentID);
                        System.out.println("Student deleted");
                        break;
                    case 5:
                        showStudyProcess(sc, studentController);
                        break;

                    case 6:
                        return;
                    default:
                        System.out.println("user enters incorrectly");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }


    public static void editStudent(Scanner sc, StudentController studentController) {
        try {
            List<Student> students = studentController.getall();
            System.out.println("choose student to edit by entering their ID: ");
            for (Student student : students) {
                System.out.println(student.getCode() + ": " + student.getName());
            }
            int choice = Integer.parseInt(sc.nextLine());
            studentController.updateStudent(choice, sc);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private static void showStudyProcess(Scanner sc, StudentController studentController) {
        System.out.println("Enter Student ID to view Study Process: ");
        int id = Integer.parseInt(sc.nextLine());
        studentController.viewStudyProcess(id);
    }
}
