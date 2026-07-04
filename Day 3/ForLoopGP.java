import java.util.Scanner;

public class ForLoopGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

       
        for ( int term = 1; term <= limit; term=term* 2) {
            System.out.println(term);
        }
    }
}
