package Loops;
// 1st method ---- not so effective kyuki i harbaar increment hoke if condtion
// ko check krega agar if true hogi jbhi loop  chlega .. iss case me loop
// each time run  hoga.
public class printoddnofrom1to100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);

        }
    }
}






