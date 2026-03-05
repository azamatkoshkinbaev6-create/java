public class Lab9 {

    public static void main(String[] args) {

        System.out.println("Task 1");
        Student s1 = new Student("Ali",20);
        Student s2 = new Student("Dana",19);
        System.out.println(Student.count);

        System.out.println("\nTask 2");
        Student2 st = new Student2("Arman");
        st.display();

        System.out.println("\nTask 3");
        System.out.println(MathUtils.square(4));
        System.out.println(MathUtils.cube(3));

        System.out.println("\nTask 4");
        Counter.increment();
        Counter.increment();
        System.out.println(Counter.count);

        System.out.println("\nTask 5");
        System.out.println(Config.appName + " " + Config.version);

        System.out.println("\nTask 7");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

        System.out.println("\nTask 8");
        University u = new University();
        University.Student us = u.new Student();
        us.show();

        System.out.println("\nTask 9");
        Computer c = new Computer();
        Computer.Processor p = c.new Processor();
        p.show();

        System.out.println("\nTask 10");
        Library l = new Library();
        Library.Book b = l.new Book();
        b.show();

        System.out.println("\nTask 11");
        Car car = new Car();
        Car.Engine e = car.new Engine();
        e.show();

        System.out.println("\nTask 12");
        System.out.println(Bank.calculate(10000));

        System.out.println("\nTask 13");
        Company comp = new Company();
        Company.Employee emp = comp.new Employee();
        emp.show();

        System.out.println("\nTask 14");
        Course course = new Course();
        Course.Student cs = course.new Student();
        cs.show();

        System.out.println("\nTask 15");
        new UniversityStats();
        new UniversityStats();
        System.out.println(UniversityStats.studentCount);

    }
}

class Student{
    String name;
    int age;
    static int count=0;

    Student(String name,int age){
        this.name=name;
        this.age=age;
        count++;
    }
}

class Student2{
    String name;
    static String university="KazNU";

    Student2(String name){
        this.name=name;
    }

    void display(){
        System.out.println(name+" studies at "+university);
    }
}

class MathUtils{
    static int square(int x){
        return x*x;
    }

    static int cube(int x){
        return x*x*x;
    }
}

class Counter{
    static int count=0;

    static void increment(){
        count++;
    }
}

class Config{
    static String appName="MyApp";
    static int version=1;
}

class Outer{

    class Inner{
        void show(){
            System.out.println("Inner class works");
        }
    }

}

class University{

    class Student{
        void show(){
            System.out.println("Student in university");
        }
    }

}

class Computer{

    class Processor{
        void show(){
            System.out.println("Processor 3.5 GHz");
        }
    }

}

class Library{

    class Book{
        void show(){
            System.out.println("Java Programming");
        }
    }

}

class Car{

    class Engine{
        void show(){
            System.out.println("Engine power 200HP");
        }
    }

}

class Bank{

    static double interestRate=5.5;

    static double calculate(double money){
        return money*interestRate/100;
    }

}

class Company{

    class Employee{
        void show(){
            System.out.println("Employee Manager");
        }
    }

}

class Course{

    class Student{
        void show(){
            System.out.println("Ali studies Java");
        }
    }

}

class UniversityStats{

    static int studentCount=0;

    UniversityStats(){
        studentCount++;
    }

}