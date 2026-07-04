import java.util.Scanner;

public class foorloop_factor {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int limit = sc.nextInt();

        for (int  i=1; i<=limit;i++){if(limit%i==0){System.out.println(i);}}
    }
    
}
