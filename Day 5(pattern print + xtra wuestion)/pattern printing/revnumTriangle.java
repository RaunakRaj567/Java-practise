
import java.util.Scanner;

public class revnumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row=sc.nextInt();

        for(int a=row; a>=1;a--){
            for(int i =1;i<=a;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }




    }
    
}
