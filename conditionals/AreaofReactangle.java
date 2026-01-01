/* Given the length and breadth of a Rectangle write a program
   to find whether the area of reactangle is greater than its 
   perimeter.*/

package conditionals;

import java.util.Scanner;

public class AreaofReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Recatngle ");
        int Length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle");
        int Breadth = sc.nextInt();
        int perimeter = 2 * (Length + Breadth);

        int Area = Length * Breadth;
        if (perimeter > Area) {
            System.out.println(" Perimeter is greater than area");
            System.out.println(" Perimeter is " + perimeter);
        } else {
            System.out.println(" Area is smaller than perimeter ");
            System.out.println(" Area of perimter is " + Area);
        }
        sc.close();
    }
}
