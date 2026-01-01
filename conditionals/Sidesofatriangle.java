// Take 3 numbers input and tell if they can be sides of traingle
package conditionals;
import java.util.Scanner;
public class Sidesofatriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enters the first number : ");
        int a =sc.nextInt();
        System.out.print("Enters the Second number : ");
        int b =sc.nextInt();
        System.out.print("Enters the Third number : ");
        int c =sc.nextInt();
        if (a+b>c && b+c>a && a+c>a) {
            System.out.println("These numbers are side of triangle");
        }
        else{
            System.out.println("invalid triangle ");
        }
        sc.close();
    }
}
