// print product of all non zero digits of a no.
package PatternPrinting;
import java.util.Scanner;
public class Productofnonzerodigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int product=1;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            if(lastdigit!=0)
            product=product*lastdigit;
            n=n/10;
        }
        System.out.println(product);
        sc.close();
    }
}
