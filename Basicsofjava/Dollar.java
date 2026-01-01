import java.util.Scanner;
public class Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter the number of dollars");
        int n = sc.nextInt();
        double dollar = n*81.06;
        System.out.println(" Value of dollar in indian currency is " +dollar);
        sc.close();

    }
    
}
