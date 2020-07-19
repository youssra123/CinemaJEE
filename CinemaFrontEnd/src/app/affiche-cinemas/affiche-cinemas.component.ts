import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ServiceCinemasService } from '../service-cinemas.service';

@Component({
  selector: 'app-affiche-cinemas',
  templateUrl: './affiche-cinemas.component.html',
  styleUrls: ['./affiche-cinemas.component.css']
})
export class AfficheCinemasComponent implements OnInit {
public villes;
public cinemas;
public salles;
public projections;
public films;
public currentCinema;
public currentVille;
public ticketsdApayer;
public currentProjection:any;
public selectedTicket:any;
  constructor(private service:ServiceCinemasService) { }

  ngOnInit() {
    this.service.getVilles()
    .subscribe(data=>{
      this.villes=data;
      console.log("villes:"+JSON.stringify(this.villes._embedded.villes[0].name));
    },err=>{console.log(err);})
  }
  onGetCinemas(v){
    this.currentVille=v;
    this.salles=undefined;
  this.service.getCinemas(v)
    .subscribe(data=>{
      console.log("data:"+data);
      this.cinemas=data;
    },err=>{console.log(err);})
  }
  onGetSalles(c){
    this.currentCinema=c;
  this.service.getSalles(c)
    .subscribe(data=>{
      console.log("salles:"+JSON.stringify(data));
      this.salles=data;
      this.salles._embedded.salles.forEach(salle=>{
        this.service.getProjections(salle)
        .subscribe(data=>{
          salle.projections=data;
          console.log("id film:"+JSON.stringify(salle.projections._embedded.projections[0].film.id));
          //console.log("id film:"+salle.projections[0].film.id);
        },err=>{console.log(err);})
      })
    },err=>{console.log(err);})
  }
  onGetTicketsPlaces(p){
this.ticketsdApayer=[];
this.currentProjection=p;
this.service.getTicketsPlaces(p)
.subscribe(data=>{
  
  this.currentProjection.tickets=data;
  this.selectedTicket=[];
  console.log("tickets :"+JSON.stringify(this.currentProjection.tickets._embedded));
},err=>{console.log(err);})
  }

  onSelectTickets(t){
    if(!t.selected){
      t.selected=true;
      this.selectedTicket.push(t);
    }else{
      t.selected=false;
      this.selectedTicket.splice(this.selectedTicket.indexOf(t),1);
    }
    console.log(this.selectedTicket);
  }
  getTicketClass(t){
    let str="btn margin ";
    if(t.reserve==true){
      str+="btn-danger";
    }else if(t.selected){
      str+="btn-warning";
    }else{
      str+="btn-success";
    }
    return str;
  }
  onPayTickets(form){
    console.log("form:"+form);
    let tickets=[];
    this.selectedTicket.forEach(t => {
      tickets.push(t.id);
    });
form.tickets=tickets;

this.service.payerTickets(form)
.subscribe(data=>{

 
},err=>{console.log(err);})
alert("ticket reserver avec succes");
this.onGetTicketsPlaces(this.currentProjection);
  }
}
