public class digitcounterfxn {

    public static void digitcounter(int a){
    int count =0;
    while(a>0){
    
        a = a/10;
        count++; }
        System.out.println(count);
    }
    public static void main(String[] args) {

        digitcounter(4596); 
        
    }

     
    }

    

