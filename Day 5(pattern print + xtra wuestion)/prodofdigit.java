import java.util.Scanner;

public class prodofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xyz=sc.nextInt();
        int prod=1;

        while(xyz>0){
         int a = xyz%10;
         prod= a*prod;
         xyz=xyz/10; 
        }
    System.out.println(prod);
    }
    
}
