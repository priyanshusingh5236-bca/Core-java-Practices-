// print all theno 1 to 100 whether divisible by 2 or 3 but skip yhe no14 or18
package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++)
      /*   {
            if(i==14||i==27)continue;
            if(i%2==0||i%3==0){
                System.out.println(i);
            } 
        } */
       // print all the even numbers from 1 to 100 
    {
        if(i%2!=0) continue;
        System.out.println(i);
    }
}
}