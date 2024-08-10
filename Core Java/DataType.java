import java.util.Scanner;
public class DataType {
  public static void main(String args[]){
    int employeeId;
    String employeeName;
    float employeeSalary;
    
    Scanner sc = new Scanner(System.in);
    employeeId  = sc.nextInt();
    employeeName = sc.next();
    employeeSalary = sc.nextFloat();

    System.out.println("Employee ID :" + employeeId);
    System.out.println("Employee Name : " + employeeName);
    System.out.println("Employee salary : " +employeeSalary);


}
}
