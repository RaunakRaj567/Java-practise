import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number: ");

        int x = sc.nextInt();

        if (x>=0){System.out.println(x);}
        else if (x<0){x=x*(-1);
            System.out.println(x);
        }
    }
    
}
