import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { TauxTaxIs } from '../model/tauxTaxIs';


@Injectable({
  providedIn: 'root'
})
export class TauxTaxIsService {


  private _tauxTaxIs!: TauxTaxIs;
  private _tauxTaxIss: TauxTaxIs[] = [];
  baseUrl="http://localhost:8036/api/tauxTaxIs";
  constructor(
    private http:HttpClient
  ) { }

  saveTauxTaxIs(TauxTaxIs:TauxTaxIs){
    return this.http.post<TauxTaxIs>(this.baseUrl+"/",TauxTaxIs);
  }
  getAllTauxTaxIs(){
    return this.http.get<TauxTaxIs[]>(this.baseUrl+"/all");
  }
  public get tauxTaxIs(): TauxTaxIs {
    if(this._tauxTaxIs==null){
      this._tauxTaxIs=new TauxTaxIs();
    }
    return this._tauxTaxIs;
  }
  public set tauxTaxIs(value: TauxTaxIs) {
    this._tauxTaxIs = value;
  }
  public get tauxTaxIss(): TauxTaxIs[] {
    return this._tauxTaxIss;
  }
  public set tauxTaxIss(value: TauxTaxIs[]) {
    this._tauxTaxIss = value;
  }

}
