package PatternPrinting;

import java.util.Scanner;

public class ProgramtoprintReverseofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no  n ");
        int n = sc.nextInt();
        int lastdigit;
        int reverse=0;
        while(n>0){
            lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        System.out.println(reverse);
        sc.close();
                      
}
}