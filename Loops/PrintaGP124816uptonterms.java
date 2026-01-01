/* Dispay this Gp 1,2,4,8,16,32...upto n terms where n is taken input from user.*/
package Loops;
import java.util.Scanner;
public class PrintaGP124816uptonterms {
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in) ;
      System.out.println("ENTER THE VALUE OF n");
      int n =sc.nextInt();
      int a =1 , r=2;
      for(int i=1;i<=n;i++){
        System.out.print(a+ "  ");
        a=a*r;
      }
      sc.close();
    } 
}
// here loop n times hi run ho rhi h
