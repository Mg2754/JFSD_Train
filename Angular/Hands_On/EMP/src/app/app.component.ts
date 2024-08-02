import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmpserviceService } from './empservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  employee : Employee;
  result:string;
  employeeArr : Employee[];
  flag : boolean;

  constructor(private service : EmpserviceService){
    this.employee = new Employee();
    this.employeeArr = [];
    this.flag = false;
    this.result="";
  }


  insertEmployee(data:any){
    this.employee.id = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    
    this.result = this.service.insertEmployee(this.employee);
  }

  updateEmployee(data:any){
    this.employee.id = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    
    this.result = this.service.updateEmployee(this.employee);
  }

  deleteEmployee(data:any){
     
    this.result = this.service.deleteEmployee(data.empId);
  }
  findAllEmployee(){
this.employeeArr=this.service.findAllEmployee();
this.flag=true;
  }
  findEmployee(data:any){
    this.employee = this.service.findEmployee(data.empId);
    this.result = this.employee.id+ " " + this.employee.empName + " " +this.employee.empSalary;
  }

}
