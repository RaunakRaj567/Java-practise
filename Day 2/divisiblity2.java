import java.util.Scanner;

public class divisiblity2 {
    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);
        System.out.print("Enter the number: ");

    int p = xy.nextInt();

    if (p%3==0 && p%2==0 ){System.out.println("Number is divisible by 6");}
    else if (p%3==0 && p%2!=0){System.out.println("Number is only divisible by 3");}
    else if (p%3!=0 && p%2==0){System.out.println("Number is only divisible by 2");}
    else {System.out.println("Number is neither divislible by 2 nor 3 ");}


    }
    
}
