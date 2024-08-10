import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int num = number;
        int n=0;
        while(num>0){
            n *= 10;
            int rem = num%10;
            n += rem;
            num /= 10;
        }
        if(number == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Plaindrome");
    }
    
}
