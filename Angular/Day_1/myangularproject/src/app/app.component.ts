import { Component } from '@angular/core';

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

  constructor(){
    this.name='Mg';
    this.age =20;
    this.email="mg.ksrct@gmail.com";
    this.txtcolor="red";
    this.imgpath="https://miro.medium.com/v2/resize:fit:783/1*Kj8Eq401fP2ecTY8r9B89Q.png";
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

}


