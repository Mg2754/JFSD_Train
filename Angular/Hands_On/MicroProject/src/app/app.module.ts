import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetDataComponent } from './get-data/get-data.component';
import { DisplayDataComponent } from './display-data/display-data.component';
import { FormsModule } from '@angular/forms';
import { GetInComponent } from './get-in/get-in.component';

@NgModule({
  declarations: [
    AppComponent,
    GetDataComponent,
    DisplayDataComponent,
    GetInComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
