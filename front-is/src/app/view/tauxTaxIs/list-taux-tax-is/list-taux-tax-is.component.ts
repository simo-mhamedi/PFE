import { Component, OnInit } from '@angular/core';
import { TauxTaxIs } from 'src/app/controller/model/tauxTaxIs';
import { TauxTaxIsService } from 'src/app/controller/service/taux-tax-is.service';

@Component({
  selector: 'app-list-taux-tax-is',
  templateUrl: './list-taux-tax-is.component.html',
  styleUrls: ['./list-taux-tax-is.component.scss']
})
export class ListTauxTaxIsComponent implements OnInit {

  constructor(
    private tauxTaxIsService:TauxTaxIsService
  ) { }


  ngOnInit(): void {
    this.tauxTaxIsService.getAllTauxTaxIs().subscribe(s=>{
      this.tauxTaxIss=s;
    })
  }

  get tauxTaxIs(): TauxTaxIs {
    return this.tauxTaxIsService.tauxTaxIs;
  }

  set tauxTaxIs(value: TauxTaxIs) {
    this.tauxTaxIsService.tauxTaxIs = value;
  }

  get tauxTaxIss(): Array<TauxTaxIs> {
    return this.tauxTaxIsService.tauxTaxIss;
  }

  set tauxTaxIss(value: Array<TauxTaxIs>) {
    this.tauxTaxIsService.tauxTaxIss = value;
  }
}
