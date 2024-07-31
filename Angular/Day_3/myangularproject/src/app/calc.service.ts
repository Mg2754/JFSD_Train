import { Injectable } from '@angular/core';

@Injectable(

)
export class CalcService {

  add(a:number,b:number){
    return a+b;
  }
  
  sub(a:number,b:number){
    return a-b;
  }
}
