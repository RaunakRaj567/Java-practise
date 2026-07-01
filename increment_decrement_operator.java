public class increment_decrement_operator {
    public static void main(String[] args) {

        int x=10;

        System.out.println(x++); //post increment means last me +1 hona uske phele sari chize run hogi, value of x remains 10 here 
        System.out.println(x);  // value of x becomes 11 because of post increment
        System.out.println(++x); // pre increament means sbse phele +1 hona baki chize baad me hogi, value of x changes to 12 because of pre increment

       int y=20;

       System.out.println(y--);  //pre increment means last me -1 hona uske phele sari chize run hogi, value of y remains 20 here 
       System.out.println(y);   // value of y becomes 19 because of pre decrement
       System.out.println(--y); // pre decrement means sbse phele -1 hona baki chize baad me hogi value of y changes to 18 because of pre decrement
    
}
    
}
