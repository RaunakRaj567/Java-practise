
import java.util.Scanner;

public class digiitcounterprac {
    public static void main(String[] args) {
        
        Scanner xy=new Scanner(System.in);

        int num= xy.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
        count++;

        }
        System.out.println(count);
    }
    
}
