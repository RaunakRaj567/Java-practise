import java.util.Scanner;

public class user_input3 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = abc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = abc.nextInt();

        int sum = x+y;
        int dif =x-y;
        int prod= x*y;
        double quotient =x/y;
        

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(prod);
        System.out.println(quotient);


    }
    
}
