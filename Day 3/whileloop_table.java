import java.util.Scanner;

public class whileloop_table {
     public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int i=1;

        while (i<=10){
                System.out.println(x+" * "+i+" = "+(x*i));
                i++;
        }


    
}
}
