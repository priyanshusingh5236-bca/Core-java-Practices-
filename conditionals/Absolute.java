// Take integer input and print absolute value of that integer.
package conditionals;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        if (n<0) {
            n = n*(-1);
        }
        System.out.println(" the absolute value is : "+n);
     sc.close();   
    }
}
