
import java.util.Scanner;

public class squareprint {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the dimension for square pattern: ");
        int sides=sc.nextInt();

        for(int i=1;i<=sides;i++){
            for(int j=1;j<=sides;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
