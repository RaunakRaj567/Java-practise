
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initialise the scanner and here sc is the name of scanner
        System.out.print("Please enter the radius: ");
        double r = sc.nextDouble();

        double area= 3.14*r*r;

        System.out.println(area);
    }
    
}
