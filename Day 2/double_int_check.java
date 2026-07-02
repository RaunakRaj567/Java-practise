
import java.util.Scanner;

// WAP to ask a input from user if it is integer then give the anser if its double then convert it into int and then give the answer
public class double_int_check {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter the nummber: ");

        double x = m.nextDouble();

        int a = (int)x;

        if(x-a>0){System.out.println(x+" Number is double");}

        else if (x-a==0) {System.out.println(a+" Number is integer");}
    }
    
}
