import java.util.Scanner;

public class ForLoopAP {
    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);

        System.out.print("Enter the initial: ");
        int initial = xy.nextInt();

        System.out.print("Enter the Limit: ");
        int limit = xy.nextInt();

        System.out.print("Enter the CD: ");
        int CD = xy.nextInt();


        for (int i = initial; i <= limit; i += CD) {
            System.out.println(i);
        }

    }
}
