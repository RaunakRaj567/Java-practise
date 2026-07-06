public class VVI_USE_OF_Return {

    public static int ron(){ // we have not written void here we have written int this means now this function will also has the value which we will assign using return.
    
        System.out.println("Hello Buddy,Ron This side!!!");
    
        return 5; //we assigned value of ron fxn as 5.
    }

    public static int decision(int a){
        if (a>6) return 0;
        else return 100;
    }
    public static void main(String[] args) {

        ron();

        System.out.println(ron()); //value of ron will get printed i.e. 5.
        

        System.out.println(decision(5)); //100 will get printed
         System.out.println(decision(23)); // 0 will get printed
    }
    
}
