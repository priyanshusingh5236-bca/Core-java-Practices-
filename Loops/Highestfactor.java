// Write a program to find highest factor of a number 'n' (other than n itself)
package Loops;

import java.util.Scanner;

public class Highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter the number");
        int n = sc.nextInt();
        int hf =1;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)// i is the factor of n
              hf = i;
        }
        System.out.println(hf);
        sc.close();

    }
}
