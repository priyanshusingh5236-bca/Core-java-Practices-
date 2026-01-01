package conditionals.Switchcase;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the date ");
        int date = sc.nextInt();
        switch (date) {
            case 67:
                System.out.println(" The day is monday ");
                break;
            case 22:
                System.out.println(" the day is tuesday");
                break;
            case 33:
                System.out.println(" The day is wednesday");
                break;
            case 44:
                System.out.println(" The day is Thursday");
                break;
            case 55:
                System.out.println(" The day is friday");

                break;
            case 66:
                System.out.println(" The day is Saturday");
                break;

            case 77:
                System.out.println(" The day is sunday ");
                break;
            default:
                System.out.println(" invalid date ");
        }
        sc.close();
    }
}
