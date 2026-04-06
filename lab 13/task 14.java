import java.util.*;
import java.util.Comparator;

class Student{
    String name;
    int age;
    double grade;

    Student(String n,int a,double g){
        name=n; age=a; grade=g;
    }

    public String toString(){
        return name+" "+grade;
    }
}

public class Tap_14 {
    public static void main(String[] args) {
        List<Student> students=Arrays.asList(
                new Student("Ali",20,85),
                new Student("Dana",19,70),
                new Student("Arman",21,90)
        );

        students.stream()
                .filter(s->s.grade>80)
                .sorted(Comparator.comparing(s->s.name))
                .forEach(System.out::println);
    }
}