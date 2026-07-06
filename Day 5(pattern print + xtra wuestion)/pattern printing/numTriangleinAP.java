import java.util.Scanner;

public class numTriangleinAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int odd=1;
        

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j=j+1){
                System.out.print(odd+" ");
                odd=odd+2;
            }
            System.out.println();
        }
    }
    
}
