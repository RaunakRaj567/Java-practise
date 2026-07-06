
import java.util.Scanner;

public class palindromcheck {
    public static void main(String[] args) {
        
        Scanner a=new Scanner(System.in);

        int num=a.nextInt();
        int real_num=num;

        int rev=0;

        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        
        if(rev==real_num){System.out.println("Its a palindrome");}
     else {System.out.println("Not a palindrome number");}

    }
    
}
