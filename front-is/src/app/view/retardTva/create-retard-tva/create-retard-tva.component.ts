import { Component, OnInit } from '@angular/core';
import { RetardTva } from 'src/app/controller/model/retardTva';
import { RetardTvaService } from 'src/app/controller/service/retard-tva.service';

@Component({
  selector: 'app-create-retard-tva',
  templateUrl: './create-retard-tva.component.html',
  styleUrls: ['./create-retard-tva.component.scss']
})
export class CreateRetardTvaComponent implements OnInit {

  constructor(
    private retardTvaService:RetardTvaService
  ) { }

  ngOnInit(): void {
  }
  public save(): void {
    this.retardTvaService.saveRetardTva(this.retardTva).subscribe(data =>{
      console.log("done");
    });
  }
  get retardTva(): RetardTva {
    return this.retardTvaService.retardTva;
  }

  set retardTva(value: RetardTva) {
    this.retardTvaService.retardTva = value;
  }

  get retardTvas(): Array<RetardTva> {
    return this.retardTvaService.retardTvas;
  }

  set retardTvas(value: Array<RetardTva>) {
    this.retardTvaService.retardTvas = value;
  }
}
