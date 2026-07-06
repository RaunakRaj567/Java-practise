import java.util.Scanner;

public class sun_even_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int prod=1;

        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                prod=prod*digit;
            }
            num=num/10;
        }
    System.out.println(prod);
    }
    
}
