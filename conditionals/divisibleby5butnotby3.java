package conditionals;

import java.util.Scanner;

public class divisibleby5butnotby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the positive integer ");
        int n =sc.nextInt();
        if (n%3!=0 && n%5==0) {
           System.out.println(" the entered number is divisible by 5 but not by  3"); 
        } 
        sc.close();
    }
    
}
