import java.util.Scanner;

public class digitcounter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

       int count=0;

       int i=10;

       while (n>0) //while the given number is more than 0. We repeatedly divide the given  number with 10 then its quotient with 10 till we get 0;
        {

        n=n/10;

        count++; //we see the count exact how many times we divide the number
         
       }
       System.out.println(count);
    }}