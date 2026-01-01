/*Display an AP 4,7,10,13,16...upto n terms */
package Loops;
import java.util.Scanner;
public class DisplayanAP471013uptonterms2ndmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the valur of n");
int n =sc.nextInt();
    int a = 4 , d=3;
    for(int i =1;i<=n;i++){
System.out.println(a+"");
    a=a+d;
    }
    sc.close();
    }
    
}
//Here we dont depend on i , we print the value of
// of a . and here loop run n numbers of times