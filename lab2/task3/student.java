package task3;

public class student {
    public void studentInfo() {
        System.out.println("Бұл Student класы");
    }

    public static void main(String[] args) {
        kafedra k = new kafedra();
        k.studentInfo();
        k.uniberInfo();
        k.kafedraInfo();
    }
}