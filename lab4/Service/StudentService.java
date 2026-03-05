package service;

import model.Student;

//7 Бірнеше класстың өзара әрекеті
public class StudentService {

    public void printStudent(Student student) {
        System.out.println("StudentService арқылы шығару:");
        student.showInfo();
    }
}
