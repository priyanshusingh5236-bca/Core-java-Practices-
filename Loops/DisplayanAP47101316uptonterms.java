package Loops;
import java.util.Scanner;
// Display an AP- 4,7,10,13,16 upto n terms
public class DisplayanAP47101316uptonterms {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n =sc.nextInt();
        for(int i =4;i<=3*n+1; i=i+3 ){
            System.out.println(i);
            sc.close();
        } 
    }
}

// an=a+(n-1)d
 // an=4+(n-1)3
 // an=4+3n-3= 3n+1