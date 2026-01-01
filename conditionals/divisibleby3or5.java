// input a positive integer n and tell if it is divisble by 5 or 3 
// or not.
package conditionals;

import java.util.Scanner;

public class divisibleby3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the positive integer ");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println(" the entered number is divisible by either 3 or  5");
        } else {
            System.out.println(" Not divisible by either 3 or 5");
        }
        sc.close();
    }
}