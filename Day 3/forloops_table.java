import java.util.Scanner;

public class forloops_table {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a=xx.nextInt();

        for (int i=1;i<11;i++){
            System.out.println(a+"*"+i+"= "+(a*i));
        }

    }
    
}
