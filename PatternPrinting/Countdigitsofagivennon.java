package PatternPrinting;

import java.util.Scanner;

public class Countdigitsofagivennon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no  n ");
        int n = sc.nextInt();
        int count = 0;
if(n==0 ) System.out.println(count++);
        while (n > 0) {

       n=    n/10; // is ki wjha se peeche se ek digit km hoti jyegi
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}
 /* Suppose user enter krta hai 65437,toh condition check hogi n>0 true hai 
   fir loop me jyege n/10krege or saath me count variable me 1 increase 
    kr denge ab n/10=6543 kyuki int int ke beech me hua sum int hi hota hai 
    aise hi 65437/10=6543.7 hota lekin n variable 6543 hi store krta||
    (6543) ye value bhi 0 se bdi hai toh fir n=6543/10=654.3 hoga or count 
    ek or bdhega aise hi jb tk n==0 nhi ho jata jb tk loop run krega or count ek ek 
    bdta jyega . or last me count ko print kr denge ||



    lekin agr n==0 hai toh hme ek alag se if condition me cound ke ek increase 
    krna pdega jaise
    if(n==0 ) System.out.println(count++);
  */