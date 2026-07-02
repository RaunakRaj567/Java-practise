
import java.util.Scanner;

public class divisibilty1 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
    System.out.print("Enter the number: ");
        int p = ab.nextInt();

        if(p%5==0){System.out.println("Number is divisible by 5");}
        else {System.err.println("Number is not divisible by 5");}
    }
    
}
