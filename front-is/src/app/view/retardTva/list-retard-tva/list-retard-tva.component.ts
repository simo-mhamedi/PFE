import { Component, OnInit } from '@angular/core';
import { RetardTva } from 'src/app/controller/model/retardTva';
import { RetardTvaService } from 'src/app/controller/service/retard-tva.service';

@Component({
  selector: 'app-list-retard-tva',
  templateUrl: './list-retard-tva.component.html',
  styleUrls: ['./list-retard-tva.component.scss']
})
export class ListRetardTvaComponent implements OnInit {

  constructor(
    private retardTvaService:RetardTvaService
  ) { }


  ngOnInit(): void {
    this.retardTvaService.getAllRetardTva().subscribe(s=>{
      this.retardTvas=s;
    })
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
