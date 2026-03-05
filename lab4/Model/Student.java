package model;

public class Student {
    String name;
    int age;
    String major;

    //2 Әдепкі конструктор
    public Student() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Белгісіз";
    }

    //2 Параметрлі конструктор
    public Student(String name, int age, String major) {
        //3 this кілт сөзі
        this.name = name;
        this.age = age;
        this.major = major;
    }

    //5 Ақпаратты шығару әдісі
    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }

    //5 Объект күйін өзгерту
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
}
