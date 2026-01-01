package Loops;
import java.util.Scanner;
// question--  display this AP 1,3,5,7,9...upto n terms
public class displayanAP13570uptonterms {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the value of n"); 
          int n = sc.nextInt();
          for(int i=1; i<=(2*n-1); i=i+2){
            System.out.println(i);
            sc.close();
          }
    }
}
// nth term = a+(n-1)d
//          = 1+(n-1)2
//          = 1+2n-2 -----= 2n-1