import { Component, OnInit } from '@angular/core';
import { SocieteService } from 'src/app/controller/service/societe.service';
import { Societe } from 'src/app/controller/model/societe';

@Component({
  selector: 'app-save-societe',
  templateUrl: './save-societe.component.html',
  styleUrls: ['./save-societe.component.scss']
})
export class SaveSocieteComponent implements OnInit {

  constructor(
    private societeService:SocieteService
  ) { }

  ngOnInit(): void {
  }
  public save(): void {
    this.societeService.saveSociete(this.societe).subscribe(data =>{
      console.log("done");
    });
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
