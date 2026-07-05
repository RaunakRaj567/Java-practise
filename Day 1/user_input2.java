import java.util.Scanner;

public class user_input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
    
        System.out.print("Enter your cgpa");
        double cgpa =sc.nextDouble();
       
        System.out.print("Enter Your Semester");
        int sem = sc.nextInt();

    

        System.out.println("Hi Raunak Here is your details");
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
        System.out.println("sem: "+sem);
    }
    
}
