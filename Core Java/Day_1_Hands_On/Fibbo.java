import java.util.Scanner;
public class Fibbo {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int num1=0;
        int num2=1;
        int n = 0;
        System.out.print(num1 +" ");
        while(n <= number){
            int sum = num1+num2;
            System.out.print(sum + " ");
            num2 = num1;
            num1 = sum;
            n+=1;   
        }
        sc.close();

    }
}