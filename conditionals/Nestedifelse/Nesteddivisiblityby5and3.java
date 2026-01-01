// Take positive integer input and tell if it's divisible by 5 nd 3
package conditionals.Nestedifelse;

import java.util.Scanner;

public class Nesteddivisiblityby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println(" The number is divisible by 5 and 3 both");
            } else {
                System.out.println(" Number is divisible by 5 but  not divisible by 3 ");

            }

        } else {
            System.out.println("Number is not divisible by 5 and 3 both");
        }
        sc.close();
    }
}
