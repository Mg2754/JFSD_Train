import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Number is not Prime");
            }
            else{
                System.out.print("Number is prime");
            }
        }
    }
    
}
