/* Given the coordinates (x,y) of a centre ofa circle amd its radius,
 * write a program which will determine whether a point lie
 * inside a circle,on the circle or outside the circle.
 */
package conditionals.conditionalMaths;
import java.util.Scanner;

public class pointinsideorousideofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = 1, y =1;
        int radius = 2;
        System.out.println(" Enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println(" Enter the value of y1");
        int y1 = sc.nextInt();
        int OA = (x-x1)*(x-x1)+(y-y1)*(y-y1);
        int R = radius*radius;
        if (OA>R) 
            System.out.println(OA+" Point lies outside the circle");
        
        else if (OA<R) 
            System.out.println(" Point lies inside the circle ");
        
        else
            System.out.println(" Point lies on the circle");
        
        sc.close();
    }
}
