import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceCinemasService {


  constructor(private http:HttpClient) { }
  public insertion(cinema){
    return this.http.post("http://localhost:8087/savecinema",cinema,{responseType:'text' as 'json'});

  }
  public delete(id){
    return this.http.get("http://localhost:8087/deletecinema/"+id,{responseType:'text' as 'json'});

  }
  public update(cinema){
    return this.http.post("http://localhost:8087/updatecinema",cinema,{responseType:'text' as 'json'});

  }
  public select(){
    return this.http.get("http://localhost:8087/cinemas",{responseType:'text' as 'json'});

  }
  public getVilles(){
    return this.http.get("http://localhost:8087/villes");

  }
  public getCinemas(v){
    return this.http.get(v._links.cinemas.href);

  }
  public getSalles(c){
    return this.http.get(c._links.salles.href);

  }
  public getProjections(s:any){
    let url=s._links.projections.href.replace("{?projection}","");
    return this.http.get(url+"?projection=p1");

  }
  public getFilms(p){
    return this.http.get(p._links.film.href);

  }
  public getTicketsPlaces(p: any) {
    let url=p._links.tickets.href.replace("{?projection}","");
    return this.http.get(url+"?projection=t1");
  }
  public payerTickets(form){
return this.http.post("http://localhost:8087/payerTickets",form);
  }
}
