// Take 3 positive integers input and print greatest of them
package conditionals;
import java.util.Scanner;
public class integergreatestofthem {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first integer : ");
        int N1= sc.nextInt();
        System.out.println("enter the Second integer : ");
        int N2= sc.nextInt();
        System.out.println("enter the Third integer : ");
        int N3= sc.nextInt();
        if (N1>N2 && N1>N3) { //N1 is maximum
            System.out.println("Greatest integer is : "+N1);
            
        }else if (N2>N1 && N2>N3) { //N2 is maximum
            System.out.println("Greatest integer is :"+N2);
        }
        else{//N3 has to be largest
        
            System.out.println("Greatest integer is : "+N3);
        }
        sc.close();
    }
}
