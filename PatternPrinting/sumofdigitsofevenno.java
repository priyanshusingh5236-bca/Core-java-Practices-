package PatternPrinting;
import java.util.Scanner;
public class sumofdigitsofevenno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no ");
    int n = sc.nextInt();
    int sum=0;
    int r;
    while(n>0){
    r=n%10;
    if(r%2==0)
        sum=sum+r;
        n=n/10;

    }
    System.out.println(sum);
    sc.close();
    }
}
