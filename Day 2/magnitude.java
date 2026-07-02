
import java.util.Scanner;


public class magnitude {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number: "); 
        int ab = x.nextInt();

        if (ab>0 && ab<69){System.out.println(ab+ " Smaller than 69");}
        else if (ab<69){System.out.println(ab+ " Greater than 69");}

        else if (ab<0){int m=(ab*-1);
            if(m>69){System.out.println((m*-1)+" Greater than 69");}
            else if (m<69){System.out.println((m*-1)+" Less than 69");}
        }
    }
    
}
