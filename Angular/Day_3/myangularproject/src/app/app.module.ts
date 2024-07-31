import { Component, NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { CalcService } from './calc.service';
import { AboutComponent } from './about/about.component';

const ROUTER:Routes=[ 
  {path:"homepage",component:HomeComponent},
  {path:"about",component:AboutComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    HomeComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(ROUTER)
  ],
  providers: [
    provideClientHydration(),
    CalcService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
