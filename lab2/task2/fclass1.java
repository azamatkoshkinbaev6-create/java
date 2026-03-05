package task2;

public class fclass1 {
    public int a;
    public int b;

    public static void main(String[] args) {
        fclass1 obj = new fclass1();
        fclass2 input = new fclass2();

        input.setValues(obj);
        obj.show();
    }

    public void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}