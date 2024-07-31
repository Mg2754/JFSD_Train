import { Component } from '@angular/core';
import { CalcService } from '../calc.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  calculator:number;
  sub:number;


  constructor(private calc:CalcService){
    this.calculator=calc.add(10,20);
    this.sub=calc.sub(20,10);
  }

}
