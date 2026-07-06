public class Tempconverter{

    public static void C2F(double a){
        double F = (1.8 * a) + 32;

       System.out.println(F);
    }

    public static void F2C(double b){
        double C = (b-32) * 5/9;
        System.out.println(C);
    }
    public static void main(String[] args) {
        C2F(25);

        F2C(96.6);
    }
}