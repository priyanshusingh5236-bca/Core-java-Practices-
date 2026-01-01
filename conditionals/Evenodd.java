package conditionals;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number n ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(" the entered number is even");

        } else {
            System.out.println(" the entered number is odd");
        }
        sc.close();
    }

}
