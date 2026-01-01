package Loops;
import java.util.Scanner;
public class Highestfactorusingbreakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();
        int hf =1 ;
        for(int i =n-1;i>=1;i--){
            if(n%i==0){
            hf=i;
            break;
        }
    }
    System.out.println(hf);
    sc.close();
    }

}
// is case me ulti side se loop chala rhe hai 
// or jis case me highest factor mia peechee se waha pr hi loop break ho jyega

