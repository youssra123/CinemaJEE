import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AjouterFilmsComponent } from './ajouter-films/ajouter-films.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AfficheCinemasComponent } from './affiche-cinemas/affiche-cinemas.component';
const routes: Routes = [
 // {path:"",redirectTo:"film",pathMatch:"full"},
  {path:"film",component:AjouterFilmsComponent},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"cinema",component:AfficheCinemasComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
