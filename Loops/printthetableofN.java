package Loops;

import java.util.Scanner;

public class printthetableofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" eter the value of N ");
        int n = sc.nextInt();
        /*
         * for(int i = n; i<=n*10; i++){
         * if(i%n==0)
         * System.out.println(i);
         * }
         
         * IN THIS CASE LOOP RUN n*10 TIMES
         */

        // 2ND and Effective Method

        for (int i = n; i <= n * 10; i = i + n) {
            System.out.println(i);
        }
        sc.close();
    }
}
// IN THIS CASE LOOP RUN ONLY 10 TIMES