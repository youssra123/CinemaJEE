import { Component, OnInit } from '@angular/core';
import { Film } from '../Film';
import { ServiceFilmsService } from '../service-films.service';

@Component({
  selector: 'app-ajouter-films',
  templateUrl: './ajouter-films.component.html',
  styleUrls: ['./ajouter-films.component.css']
})
export class AjouterFilmsComponent implements OnInit {
film: Film=new Film("","","",new Date,0);
message:any;  
constructor(private service:ServiceFilmsService) { }

  ngOnInit() {
  }
public registerNow(){
  let resp=this.service.insertion(this.film);
resp.subscribe((data)=>this.message=data);
}
}
