import java.util.Scanner;

public class odd_even{
    public static void main(String[] args) {
        Scanner ac =new Scanner(System.in);

        System.out.print("Enter your Number:");
        int x = ac.nextInt();

        if(x%2==0)
            {System.out.println("Number is even");}
        else {System.out.println("Number is odd");
            System.out.println("Odd  hai Ladle");
        }



    }
}