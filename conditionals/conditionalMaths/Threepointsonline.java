/*Given the three points (x1,y1), (x2,y2) and(x3,y3) write a program
 *  to check all if all three points fall on one straight line
 */
package conditionals.conditionalMaths;
import java.util.Scanner;
public class Threepointsonline {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print(" Enter the value of x1 : ");
    double x1 = sc.nextInt();
    System.out.print(" Enter the value of x2 : ");
    double x2 = sc.nextInt();
    System.out.print(" Enter the value of x3 : ");
    double x3 = sc.nextInt();
    System.out.print(" Enter the value of 1Y : ");
    double Y1 = sc.nextInt();
    System.out.print(" Enter the value of Y2 : ");
    double Y2 = sc.nextInt();
    System.out.print(" Enter the value of Y3 : ");
    double Y3 = sc.nextInt();
    double m1 = (Y2-Y1)/(x2-x1);
    double m2 = (Y3-Y2)/(x3-x2);
    if (m1==m2) {
        System.out.println("Three points lie on a slope of a line");
    }
    else{
        System.out.println(" They do not lie on a single line");
    }
    sc.close();
 }   
}
