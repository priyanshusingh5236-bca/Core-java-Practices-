/* If cp and sp of an item is input through the keyboard, write   
   a program to determine whether the seller has made a profit 
   or incurre loss. Also determine how much profit he made or
   loss he incured. */

package conditionals;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();
        int profit = sp - cp;
        int loss = cp - sp;
        if (sp > cp) {
            System.out.println(" seller made profit");
            System.out.println(" profit is " + profit);
        } else if (cp == sp) {
            System.out.println("no profit no loss");

        } else {
            System.out.println("Seller made a loss of : "+loss+" rupees");
            

        }
        sc.close();
    }

}
