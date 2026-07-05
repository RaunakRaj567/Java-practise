public class Circle {
    public static void main(String[] args) {
        int r=7;
        double pi=3.14;

        double circumference = 2*pi*r;
        double area = pi*r*r;

        double diameter = r*2;

        System.out.println(area+" m^2");
        System.out.println(circumference+" m");
        System.out.println(diameter+" m");
    }
}
