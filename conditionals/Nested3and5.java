package conditionals;

import java.util.Scanner;

public class Nested3and5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the positive integer ");
        int n =sc.nextInt();
        if (n%5==0) {
            if (n%3==0) {
                System.out.println(" number is divisible by both 5 and 3");
            }else{
                System.out.println(" Not divisble");
            }
        }else{
            System.out.println(" not divisible");
        }
      
        sc.close();
    }
}
