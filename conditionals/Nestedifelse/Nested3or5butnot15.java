//Take positive integer input and tel if it is divisible by
//5or 3 but not divisble by 15. 
package conditionals.Nestedifelse;

import java.util.Scanner;

public class Nested3or5butnot15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the positive integer ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0) {
            if (n%15!=0) {
                System.out.println("no is divisible by either 5 or 3 but not by15");
            }else{
                System.out.println(" not divisible");
            }
        }else{
            System.out.println(" not divisible by 5 or 3");
        }
        sc.close();
     }
    }

