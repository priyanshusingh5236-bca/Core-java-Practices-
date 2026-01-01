import java.util.Scanner;
public class Starpattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int r = sc.nextInt();
        System.out.println("enter the column");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){  // ye loop rows print kregi.. m rows
            for(int j=1;j<=c;j++){  // ye loops star print kregi.. each row me n stars
               System.out.print("*");
            }
            System.out.println(); // aftereach row there is gap in n lines
        }
    }
}







