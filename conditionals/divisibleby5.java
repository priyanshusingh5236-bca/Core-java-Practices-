// Take number n input from user and tell if it is divisible by 5 or not
package conditionals;
import java.util.Scanner;
public class divisibleby5 {
 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print(" Enter the ineger :  ");
    int n = sc.nextInt();
    if (n%5==0) {
        System.out.println(" number is divisible by 5 ");
        
    }
    else if (n%5!=0) {
        System.out.println(" number is not divisble by 5 ");
        
    }
    sc.close();
 }

}
