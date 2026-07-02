import java.util.Scanner;

public class pofit_loss {
    public static void main(String[] args) {
        Scanner m =new Scanner(System.in);

        System.out.print("Enter the Cost Price: ");
        int CP = m.nextInt();

        System.out.print("Enter the Selling Price: ");
        int SP = m.nextInt();

        if (CP==SP){System.out.println("No profit No Loss");}

        else if (CP>SP){int Loss = CP-SP;
            System.out.println("Loss is of rs "+Loss);
        }

          else if (SP>CP){int Profit = SP-CP;
            System.out.println("Profit is of rs "+Profit);
        }
    }
    
}
