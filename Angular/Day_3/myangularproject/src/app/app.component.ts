import { Component } from '@angular/core';
import { CalcService } from './calc.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'myangularproject';
  name:string;
  age:number;
  email:string;
  txtcolor:string;
  imgpath:string;

  flag:boolean;
  vehicles : string[];
  selected_vec : string = '';
  mystyle:{};
  myclass:string;
  calculator:number;
  sub:number;

  fname : string = "";

  constructor(private calc:CalcService){
    this.name='Mg';
    this.age =20;
    this.email="mg.ksrct@gmail.com";
    this.txtcolor="red";
    this.imgpath="https://miro.medium.com/v2/resize:fit:783/1*Kj8Eq401fP2ecTY8r9B89Q.png";

    this.flag=true;
  this.vehicles=["Twowheel","ThreeWheel","FourWheel"]
  this.mystyle={'width' : '40%','border' : '2px solid red'};
  this.myclass='myclass1';
  this.calculator=calc.add(10,20);
  this.sub=calc.sub(20,10);

  }

  getadd(a:number,b:number){
    let sum = a+b;
    return sum;

  }
  changename(){
    this.name="Ravi";
  }
  changeimg(){
    if (this.imgpath == "https://miro.medium.com/v2/resize:fit:783/1*Kj8Eq401fP2ecTY8r9B89Q.png"){
      this.imgpath="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYrjkPeRkL_Q3RThOD5F8Kow8fEKHJMcnwuA&s";
    }
    else if(this.imgpath == "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYrjkPeRkL_Q3RThOD5F8Kow8fEKHJMcnwuA&s"){
      this.imgpath="https://miro.medium.com/v2/resize:fit:783/1*Kj8Eq401fP2ecTY8r9B89Q.png";
    }
  }

  changeflag(){
    this.flag = ! this.flag;
  }
  
  selected_item(vec : string){
    this.selected_vec = vec;
  }
  
  changecolor(){
    if(this.myclass=='myclass1')
      this.myclass='myclass2';
    else if(this.myclass=='myclass2')
      this.myclass='myclass1';
  }

}


