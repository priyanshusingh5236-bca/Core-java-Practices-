import java.util.Scanner;
public class Areaofcircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of radius");
        double Radius = sc.nextDouble();
        double Area = 3.14*Radius*Radius;
        System.out.println(" Area of circle is " +Area);
        sc.close();
        

    }
}