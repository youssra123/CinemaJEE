import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceFilmsService {

  constructor(private http:HttpClient) { }
  public insertion(film){
    return this.http.post("http://localhost:8087/savefilm",film,{responseType:'text' as 'json'});

  }
  public delete(id){
    return this.http.get("http://localhost:8087/deletefilm/"+id,{responseType:'text' as 'json'});

  }
  public update(film){
    return this.http.post("http://localhost:8087/updatefilm",film,{responseType:'text' as 'json'});

  }
  public select(){
    return this.http.get("http://localhost:8087/films",{responseType:'text' as 'json'});

  }
}
