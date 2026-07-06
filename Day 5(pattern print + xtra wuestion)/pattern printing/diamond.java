
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    int ab=sc.nextInt();

    for(int i=1;i<=ab;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
    System.out.println();}

    for(int z=ab-1;z>=1;z--){
        for(int y=1;y<=z;y++){
            System.out.print("* ");
        }
    System.out.println();}

    }
    }
    

