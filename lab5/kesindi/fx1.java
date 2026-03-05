package kesindi;

import java.util.Scanner;
public class fx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("x енгізіңіз: ");
        double x=sc.nextDouble();
        double y;

        if(x<0)
            y=x*x;
        else if(x<=2)
            y=2*x+1;
        else
            y=Math.sqrt(x);

        System.out.println("y="+y);
    }
}
