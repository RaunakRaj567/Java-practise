import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();
        int rev=0;//let revrse be 0 for now

        while(num>0){
            int digit=num%10; //Take out the last digit from number
            rev=rev*10+digit; //rev*10 we do to move the old digit to higher place and then we add new digit
            num=num/10;//we do to reduce number to 0
                    }
System.out.println(rev);


    }
    
}
