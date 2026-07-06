
import java.util.Scanner;

public class samerow {

    public static void main(String[] args) {
        
        // Sample output 1 1 1 1
        //               2 2 2 2
        //               3 3 3 3

        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for (int z=1;z<=row;z++){
                System.out.print(i+" ");

            }
        System.out.println();}

    }
    
}
