package conditionals.Predictheoutput;

public class important3 {
   public static void main(String[] args) {
    int i =65;
    char j ='A';
     if (i==j) // yha hua kya ki jb bhi ham kisi character ko
              //  kisi integer se compare krte hai toh wah us character ki ascii value se compare hota
              // or yha A ki Ascii value 65 hai isliye  (" c is wow"); print hoga.
     System.out.println(" c is wow");
    else System.out.println(" c i sheadache ");
        int x =(int)j;
        System.out.println(x);
   }
}


// int x =(int)j;
        //System.out.println(x)   -----  yha pe typecasting use ho rhi
         //                       -----   hai char j ko int bnya jaa rha hai
         //                       -----   isse se ascii value niklegi