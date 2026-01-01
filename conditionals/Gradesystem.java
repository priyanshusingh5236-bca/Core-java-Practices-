/*Take input Percentage of a Student and print the grades according to marks*/
// 90-100 EXCELLENT
// 80-90 VERY GOOD
// 70-80 GOOD
// 60-70 CAN DO BETTER
//50-60 AVERAGE
// 40-50 BELOW AVERAGE
// <40 FAIL 

package conditionals;

import java.util.Scanner;

public class Gradesystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE PERCENTAGE OF STUDENT : ");
        int n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("Excellent performance");
        } else if (n >= 80 && n <= 90) {
            System.out.println(" Very good performance");
        } else if (n >= 70 && n <= 80) {
            System.out.println("Good performance");
        } else if (n >= 60 && n <= 70) {
            System.out.println("Can do Better");
        } else if (n >= 50 && n <= 60) {
            System.out.println(" Average Performer ");
        } else if (n >= 40 && n <= 50) {
            System.out.println("Below Average Performer");
        } else {
            System.out.println("Student is Fail");
        }
        sc.close();
    }
}
