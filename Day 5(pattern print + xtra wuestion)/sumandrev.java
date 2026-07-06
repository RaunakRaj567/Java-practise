import java.util.Scanner;

public class sumandrev {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int rev=0;
        while(a>0){
            int digit = a%10;
            sum=sum+digit;
            rev=rev*10+digit;
            a=a/10;
        }
        System.out.println(rev);
        System.out.println(sum);
    }
}
