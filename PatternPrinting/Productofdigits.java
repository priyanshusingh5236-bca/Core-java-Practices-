// print the product of no enter byuser
package PatternPrinting;
import java.util.Scanner;
public class Productofdigits {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no ");
    int n = sc.nextInt();
    int lastdigit;
    int product=1;
    while(n>0){
        lastdigit=n%10;
        product=product*lastdigit;
        n=n/10;

    }
    System.out.println("product of no is "+product);
    sc.close();
}    
}
