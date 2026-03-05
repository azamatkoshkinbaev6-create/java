package main;

import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //8  Объектінің құрылуы
        Student s1 = new Student("Қаракөз", 18, "Дизайнер");
        Student s2 = new Student("Бекзат", 19, "Финансы и основы экономика");
        Student s3 = new Student(); // әдепкі конструктор

        //4 Бір-бірінен тәуелсіз объектілер
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        //5 Әдіс арқылы объектіні өзгерту
        s3.changeMajor("Математика");
        s3.showInfo();

        //7 Класстардың өзара әрекеті
        StudentService service = new StudentService();
        service.printStudent(s1);
        //8 Бағдарлама аяқталған соң объектілер жойылады

        Scanner scanner = new Scanner(System.in);

        // NAME енгізу
        System.out.print("Атыңызды енгізіңіз: ");
        String name = scanner.nextLine();

        if (name.matches(".*\\d.*")) {
            System.out.println("Қате! Аты тек әріптерден тұруы керек.");
            return;
        }

        // AGE енгізу
        int age;
        try {
            System.out.print("Жасыңызды енгізіңіз: ");
            age = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Қате! Жас тек сан болуы керек.");
            return;
        }

        // 2008 шарты
        int birthYear = 2026 - age;

        if (birthYear > 2008) {
            System.out.println("Сіз әлі студент емессіз");
            return;
        }

        // Барлығы дұрыс болса — объект құрамыз
        Student student = new Student(name, age, "Information Systems");
        student.showInfo();
    }
}



