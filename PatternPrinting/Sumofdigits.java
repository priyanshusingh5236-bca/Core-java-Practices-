package PatternPrinting;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        int n, r, sum = 0;

        System.out.println("Enter the number n ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
//suppose user ne n=123 daala joh 0 se bda hai loop me jao n%10 jo ki 6 hai ko r me store karo
// fir sum naam ke variable me r ki value ko store kr do n%10 krne ke baad 
// n ki value 12 hai jisko  aise [n = n / 10;] computer ko btana hoga 