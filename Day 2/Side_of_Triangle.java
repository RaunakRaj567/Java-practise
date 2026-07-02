import java.util.Scanner;

public class Side_of_Triangle {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        int a,b,c;
        System.out.print("Enter 1st side: ");
        a=x.nextInt();
        System.out.print("Enter 2nd side: ");
        b=x.nextInt();
        System.out.print("Enter 3rd side: ");
        c=x.nextInt();

        if (a+b>c && b+c>a && a+c>b){System.out.println("Triangle can be formed");}
        else {System.out.println("No Triangle will be formed");}
        
        
    }
    
}
