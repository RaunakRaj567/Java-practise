import java.util.Scanner;


public class four_digit {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Number: ");

        int a=x.nextInt();

        if (a>999 && a<9999){System.out.println(a+" It  is four digit number");}

        else {System.out.println(a+" It  is not a four digit number");}
    }
    
}
