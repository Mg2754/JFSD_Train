import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int n = num;
        int arms = 0;
        int p = 3;
        
        while(n>0){
            int rem = n%10;
            arms += Math.pow(rem,p);
            n /= 10;
        }
        if(num == arms)
            System.out.println("Armsstrong");
        else
            System.out.println("Not Armstrong");
    }
    
}
