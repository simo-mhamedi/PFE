import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SaveSocieteComponent } from './view/societe/save-societe/save-societe.component';
import { SocieteListComponent } from './view/societe/societe-list/societe-list.component';
import { CreateTauxTaxIsComponent } from './view/tauxTaxIs/create-taux-tax-is/create-taux-tax-is.component';
import { ListTauxTaxIsComponent } from './view/tauxTaxIs/list-taux-tax-is/list-taux-tax-is.component';
import { CreateRetardTvaComponent } from './view/retardTva/create-retard-tva/create-retard-tva.component';
import { ListRetardTvaComponent } from './view/retardTva/list-retard-tva/list-retard-tva.component';

const routes: Routes = [
  { path: 'create-societe', component: SaveSocieteComponent },
  { path: 'list-societes', component: SocieteListComponent },
  { path: 'create-retardTva', component: CreateRetardTvaComponent },
  { path: 'list-retardTva', component: ListRetardTvaComponent },
  { path: 'create-tauxTaxIs', component: CreateTauxTaxIsComponent },
  { path: 'list-tauxTaxIs', component: ListTauxTaxIsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
