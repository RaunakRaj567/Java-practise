
import java.util.Scanner;

public class firstques {
    public static void main(String[] args) {
        // WAP asking user for rows and colun then print the stars

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int n=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" * ");
            }
             System.out.println();
        }

   }
    
}
