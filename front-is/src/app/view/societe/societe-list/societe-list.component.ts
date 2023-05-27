import { Component, OnInit } from '@angular/core';
import { Societe } from 'src/app/controller/model/societe';
import { SocieteService } from 'src/app/controller/service/societe.service';

@Component({
  selector: 'app-societe-list',
  templateUrl: './societe-list.component.html',
  styleUrls: ['./societe-list.component.scss']
})
export class SocieteListComponent implements OnInit {

  constructor(
    private societeService:SocieteService
  ) { }
  ngOnInit(): void {
    this.societeService.getAllSocietes().subscribe(
      s=>{
        this.societes=s
      }
    )
  }
  get societe(): Societe {
    return this.societeService.societe;
  }

  set societe(value: Societe) {
    this.societeService.societe = value;
  }

  get societes(): Array<Societe> {
    return this.societeService.societes;
  }

  set societes(value: Array<Societe>) {
    this.societeService.societes = value;
  }
}
