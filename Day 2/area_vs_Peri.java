import java.util.Scanner;

public class area_vs_Peri {
    public static void main(String[] args) {
        Scanner rr=new Scanner(System.in);
        System.out.print("Enter the Length: ");
        double len = rr.nextDouble();
        System.out.print("Enter the Width: ");
        double wid = rr.nextDouble();

        Double area = len*wid;
        System.out.println("Area: "+area);

        Double peri = 2*(len+wid);
        System.out.println("Perimeter: "+peri);

        if (area>peri){System.out.println("Area is larger than Perimeter.");}
        else {System.out.println("Perimeter is larger than Area.");}


    }
    
}
