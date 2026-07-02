import java.util.Scanner;
public class Greatest_of_three {
    public static void main(String[] args) {
        
    Scanner rr = new Scanner(System.in);
    int a,b,c;

    System.out.print("Enter 1st number: ");
    a = rr.nextInt();
    System.out.print("Enter 2nd number: ");
    b = rr.nextInt();
    System.out.print("Enter 3rd number: ");
    c = rr.nextInt();

    if (a>b && a>c){System.out.println(a+" is the gratest");}
    if (a<b && b>c){System.out.println(b+" is the gratest");}
    if (b<a && a<c){System.out.println(c+" is the gratest");}
    

    }
    
}
