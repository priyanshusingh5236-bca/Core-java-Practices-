/* If the ages of Ram, shyam and Ajay are input through the keyboard, 
   write a program to determine the youngest of the three. */

package conditionals;

import java.util.Scanner;

public class Youngestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram : ");
        int Ram = sc.nextInt();
        System.out.print("Enter the age of Shyam : ");
        int Shyam = sc.nextInt();
        System.out.print("Enter the age of Ajay : ");
        int Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay)
            System.out.println("Ram is the youngest having age : "+Ram+"years old");
        else if (Shyam < Ram && Shyam < Ajay)
            System.out.println("Shyam is the youngest having age : "+Shyam+ "Years old");
        else
            System.out.println("Ajay is the youngest having age :"+Ajay+"Ajay");
        sc.close();
    }
}
