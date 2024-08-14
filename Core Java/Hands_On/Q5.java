package hands_on;

class Employee{
	void work() {
		System.out.println("Employee is Working");
	}
	int getSalary() {
		return 5000;
	}
}
class HRManager extends Employee{
	void work() {
	System.out.println("HR manager is a Human Resourcer ");
	
}
	void addEmployee(String name) {
		System.out.println("Added new Employee : "+ name);
	}
}
	

public class Q5 {
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.work();
		System.out.println("Employee salary : "+emp.getSalary());
		
		HRManager hr = new HRManager();
		hr.work();
		System.out.println("Salary : "+hr.getSalary());
		hr.addEmployee("Murugesh");
	}

}
