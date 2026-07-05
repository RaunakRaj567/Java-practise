public class Mathfxn{
    public static void main(String[] args) {

        // Math.pow is used to find power of number (a,b) a is no. and b is exponential power
        double x = Math.pow(2,5);
        System.out.println(x);

        //Math.sqrt is used to find square root of any number
        double y = Math.sqrt(5.3);
        System.out.println(y);
        
         //Math.cbrt is used to find cube root of any number

         double z = Math.cbrt(8);
         System.out.println(z);

         //Math.abs is used to give positive number (from negative)

         double a = Math.abs(-96);
         double a1 = Math.abs(6);

        System.out.println(a);
        System.out.println(a1);

        //Math.floor used for greatest integer fxn

        double b=Math.floor(5.9);
        double b1=Math.floor(5.1);
        double b2=Math.floor(-5.9);
        double b3=Math.floor(-5.1);
        double b4=Math.floor(-5);
        double b5=Math.floor(5);

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b5);
        System.out.println(b4);


        //Math.ceil used to give value that is just one more than the number

        double c=Math.ceil(9.00001);
        double c1=Math.ceil(9.9999);
        double c2=Math.ceil(-9.00001);
        double c3=Math.ceil(-9.999);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //Math.min or Math.max used to find max and min number between two

        System.out.println(Math.max(86.35,86.33));
        System.out.println(Math.min(-98,-9999  ));
    }
}