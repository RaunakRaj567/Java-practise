import java.util.Scanner;

public class whileloop_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x=sc.nextInt();

        int y=0;

        while (y<x){
            System.out.println(x);
            --x;
        }
    }
    
}
