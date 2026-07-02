import java.util.Scanner;

public class LPU_grade {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("Enter your Grades: ");
        int grades = x.nextInt();

        if (grades>90 && grades<=100){System.out.println("O");}
        else if (grades>80 && grades<=89){System.out.println("A+");}
        else if (grades>70 && grades<=79){System.out.println("A");}
        else if (grades>60 && grades<=69){System.out.println("B+");}
        else if (grades>50 && grades<=59){System.out.println("B");}
        else if (grades>40 && grades<=49){System.out.println("C");}
        else if (grades>30 && grades<=39){System.out.println("D");}
        



    }
    
}
