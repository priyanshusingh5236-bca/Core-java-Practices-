// Take positive integer input and tell if it is divisible by 5 an 3
package conditionals;
import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the positive integer ");
        int n =sc.nextInt();
        if (n%3==0 && n%5==0) {
           System.out.println(" the entered number is divisible by 3 and  5 both"); 
        } else{
            System.out.println(" Not divisible by 3 and 5");
        }
        sc.close();
    }
}
