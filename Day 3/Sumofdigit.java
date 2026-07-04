
import java.util.Scanner;

public class Sumofdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        

        while (n>0){
        int digit=n%10; // we take out last digit of number
        sum=digit+sum; //we add the digit to sum (i.e 0 in starting) and then we add old digit to the new digit we take out
        n=n/10;   // we make digit shorter and shorter
        }

        System.out.println(sum);
    }
    
}
