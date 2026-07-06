public class trianglecheck {

    public static void Triangle(int a, int b, int c){
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Triangle is possible");
        } else {
            System.out.println("Triangle not possible");
        }
    }
    public static void main(String[] args) {
        Triangle(75,85,36);
        Triangle(8,9,20);
    }
    
}
