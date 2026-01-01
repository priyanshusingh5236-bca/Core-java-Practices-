 /* Take positive integer input and tell if it is a 3digit no or not */
 package conditionals;
import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the Number : ");
        int n =sc.nextInt();
        if (n>99 && n<1000) { // ye dono n 99 se bdi or 1000se 
                              //choti honi chaiye jb hi code chlega
            System.out.println(" the entered number is 3 digit number");
            
        }else System.out.println("invalid number");
        sc.close();
    }

}
