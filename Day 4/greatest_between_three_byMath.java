import java.util.Scanner;

public class greatest_between_three_byMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        int a,b,c;

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("The Greaaatest number is"+Math.max((Math.max(a, b)),c));
    }
    
}
