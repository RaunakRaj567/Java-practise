import java.util.Scanner;

public class foorloop_HCF_Hard {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int hf=1;// for now consider hf to be 1

        for (int i=1;i<num;i++){if(num%i==0) hf=i;   
            // value of hf gets assign till we get the last hf
        }
   

        System.out.println(hf);//it simply prints the last hf

    }
    
}
 