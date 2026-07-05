public class BODMAS {
    public static void main(String[] args) {
        //BODMAS- Bracket (),{},[] -> Of [power] Math.pow(x,y) -> Division Multiplication Addition Subtraction

        int result1 = 10 + 2 * 3;       // Multiplication first 
        int result2 = (10 + 2) * 3;    // Brackets first 
        double result3 = 10 + Math.pow(2, 3); // Exponent will be done first

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
