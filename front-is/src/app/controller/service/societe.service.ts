import { Injectable } from '@angular/core';
import { Societe } from '../model/societe';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SocieteService {

  private _societe!: Societe;
  private _societes: Societe[] = [];
  baseUrl="http://localhost:8036/api/societe";
  constructor(
    private http:HttpClient
  ) { }

  saveSociete(societe:Societe){
    return this.http.post<Societe>(this.baseUrl+"/",societe);
  }
  getAllSocietes(){
    return this.http.get<Societe[]>(this.baseUrl+"/all");
  }
  public get societe(): Societe {
    if(this._societe==null){
      this._societe=new Societe();
    }
    return this._societe;
  }
  public set societe(value: Societe) {
    this._societe = value;
  }
  public get societes(): Societe[] {
    return this._societes;
  }
  public set societes(value: Societe[]) {
    this._societes = value;
  }
}
