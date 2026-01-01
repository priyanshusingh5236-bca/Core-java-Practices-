package Loops;

import java.util.Scanner;

public class PrimeORComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no ");
        int n = sc.nextInt();
        Boolean flag = false; // false means prime
        for (int i = 2; i < n ; i++) {
            if (n % i == 0)

                flag = true; // true mens composite
            break;

        }
        if(n==1)
        System.out.println(" neither prime nor composite");
       else  if (flag == false)
                    System.out.println(" prime no ");

        else
            System.out.println(" composite no");
            sc.close();
    }
}
/* is case me phele humne no ko prime hi mana jaise hi number jaise  */