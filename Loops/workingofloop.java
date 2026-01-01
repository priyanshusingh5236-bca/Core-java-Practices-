package Loops;

public class workingofloop {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=3;i++){
            System.out.println(" jab value 3 se bdi hogi loop tut jyega");
        }
        System.out.println(i);
    }
}
/* yha hua kya ki ek int i variable outside the loop declare kr diya
 * fir for loop me i=1 assign kr diya 
 * loop me chl kya rha hai ki phele i ko 1 assign hua. assign ek hi baar hota hai
 *  fir condtion check hogi agar condn true hai toh body print kr do
 * or ek increment bhi kr do
 * dobara condition dekho or agar true hai toh print kr ke increment kr do i ko 
 * or yr jb tk chlega jb tk loop false nhi ho jaati.jaise hi loop false hoti hai
 * i ki value loop ke bahar print ho jyegi 
 * 
 * 
 * kyu ki is case me hmne int i ko as a globalvariable declare kr rkha
 * hai matlb loop ke bahar declare kra hai 
 * useee koi bhi ccces kr skta hai
 */