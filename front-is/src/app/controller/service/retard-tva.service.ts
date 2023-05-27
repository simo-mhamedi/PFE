import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { RetardTva } from '../model/retardTva';

@Injectable({
  providedIn: 'root'
})
export class RetardTvaService {

  private _retardTva!: RetardTva;
  private _retardTvas: RetardTva[] = [];
  baseUrl="http://localhost:8036/api/retardTva";
  constructor(
    private http:HttpClient
  ) { }

  saveRetardTva(retardTva:RetardTva){
    return this.http.post<RetardTva>(this.baseUrl+"/",retardTva);
  }
  getAllRetardTva(){
    return this.http.get<RetardTva[]>(this.baseUrl+"/all");
  }
  public get retardTva(): RetardTva {
    if(this._retardTva==null){
      this._retardTva=new RetardTva();
    }
    return this._retardTva;
  }
  public set retardTva(value: RetardTva) {
    this._retardTva = value;
  }
  public get retardTvas(): RetardTva[] {
    return this._retardTvas;
  }
  public set retardTvas(value: RetardTva[]) {
    this._retardTvas = value;
  }

}
