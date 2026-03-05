package task4;

public class Lab {
    public String subject;
    public int hours;

    public static void main(String[] args) {
        Lab lab = new Lab();
        Lec lec = new Lec();

        lec.setLabData(lab);
        lab.show();
    }

    public void show() {
        System.out.println("Пән: " + subject);
        System.out.println("Сағат саны: " + hours);
    }
}