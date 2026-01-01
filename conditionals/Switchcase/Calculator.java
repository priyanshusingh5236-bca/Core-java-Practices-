package conditionals.Switchcase;

import java.util.Scanner;

public class Calculator {
    /*
     * Switch statement is very similar to if-else.
     * It is used to perform some task according to choice of user.
     * or it is used when we have to make choice between number of
     * alternatives for a given variable.
     * IT HAS 3 KEYWORDS
     * a). case- To check the value which has been passed.
     * b). break- To break the case after execution of particular choice.
     * c). default- Statements which will be executed when no choices
     * matches i.e in case of invalid choice.
     */

    // SYNTAX OF SWITCH CASE
    /*
     * Switch(Var){
     * case c1:
     * //code
     * break;
     * case c2:
     * //code
     * break;
     * case c3:
     * //code
     * break;
     * default:
     * //code
     * }
     * 
     * .Var can be integer,character,String in java.
     * . A switch can occur within but in practice it is rarely done
     * 
     */
    /* Question- Wap to create simple calculator using switch statement */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of a");
        int a = sc.nextInt();
        System.out.println(" enter the value of b ");
        int b = sc.nextInt();
        System.out.println(" enter the choice of user");
        int Ch = sc.nextInt(); // 20 for add , 40 for sub , 30 for multiply,400 for divide
        switch (Ch) {
            case 20:
                System.out.println(" adittion of a and b is : " + (a + b));
                break;
            case 40:
                System.out.println(" subtraction of a-b is : " + (a - b));
                break;
            case 30:
                System.out.println(" subtraction of a-b is : " + (a * b));
                break;
            case 400:
                System.out.println(" subtraction of a-b is : " + (a / b));
                break;
            default:
                System.out.println(" the enter choice is i valid");

        }
        sc.close();
    }

}
