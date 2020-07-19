import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AjouterFilmsComponent } from './ajouter-films/ajouter-films.component';
import { AfficheCinemasComponent } from './affiche-cinemas/affiche-cinemas.component';
import { ServiceFilmsService } from './service-films.service';
import { ServiceCinemasService } from './service-cinemas.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    AjouterFilmsComponent,
    AfficheCinemasComponent,
    LoginComponent,
    RegisterComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceFilmsService,ServiceCinemasService],
  bootstrap: [AppComponent]
})
export class AppModule { }