import java.util.Scanner;

public class divisiblity3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a= x.nextInt();
        
        if (a%5==0 && a%3==0){System.out.println(a+" divisible by 5 and 3 both");}
        else if (a%5==0){System.out.println(a+" divisible by 5");}
         else if(a%3==0){System.out.println(a+" divisible by 3");}

          else if (a%5==0 && a%3==0){System.out.println(a+" divisible by 5 and 3 both");}
           else  if (a%5!=0 && a%3!=0){System.out.println(a+" is not divisble by 5 and 3");}


    }
    
}
