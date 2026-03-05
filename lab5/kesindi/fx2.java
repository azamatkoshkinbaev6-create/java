package kesindi;

import java.util.Scanner;
public class fx2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("x енгізіңіз: ");
        double x=sc.nextDouble();
        double y;

        if(x<0)
            y=Math.sin(x);
        else if(x<=1)
            y=Math.cos(x);
        else
            y=Math.tan(x);

        System.out.println("y="+y);
    }
}
