/* Take 3 positive integers input snd print the greatest of them */
package conditionals.Nestedifelse;

import java.util.Scanner;

public class Greatestofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first integer : ");
        int a = sc.nextInt();
        System.out.println("enter the Second integer : ");
        int b = sc.nextInt();
        System.out.println("enter the Third integer : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a + "is the largest");
            } else {// a<c -b<a<c
                System.out.println(c + " is the largest");
            }
        } else { // a<b
            if (b > c) {
                System.out.println(b + " is the largest");
            } else {// b<c -a<b<c
                System.out.println(c + " is the largest");
            }
        }
        sc.close();
    }
}
