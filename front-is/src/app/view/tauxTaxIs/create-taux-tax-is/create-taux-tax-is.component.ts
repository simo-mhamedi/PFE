import { Component, OnInit } from '@angular/core';
import { TauxTaxIs } from 'src/app/controller/model/tauxTaxIs';
import { TauxTaxIsService } from 'src/app/controller/service/taux-tax-is.service';

@Component({
  selector: 'app-create-taux-tax-is',
  templateUrl: './create-taux-tax-is.component.html',
  styleUrls: ['./create-taux-tax-is.component.scss']
})
export class CreateTauxTaxIsComponent implements OnInit {
  constructor(
    private tauxTaxIsService:TauxTaxIsService
  ) { }

  ngOnInit(): void {

  }
  public save(): void {
    this.tauxTaxIsService.saveTauxTaxIs(this.tauxTaxIs).subscribe(data =>{
      console.log("done");
    });
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
