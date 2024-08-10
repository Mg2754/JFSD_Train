import java.util.Scanner;
public class Array {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    int sum = 0;
    
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
}
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
      sum += arr[i];
}
    System.out.println("Sum of All elements : " + sum);
  
}

}