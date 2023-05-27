import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SaveSocieteComponent } from './view/societe/save-societe/save-societe.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SocieteListComponent } from './view/societe/societe-list/societe-list.component';
import { CreateTauxTaxIsComponent } from './view/tauxTaxIs/create-taux-tax-is/create-taux-tax-is.component';
import { ListTauxTaxIsComponent } from './view/tauxTaxIs/list-taux-tax-is/list-taux-tax-is.component';
import { CreateRetardTvaComponent } from './view/retardTva/create-retard-tva/create-retard-tva.component';
import { ListRetardTvaComponent } from './view/retardTva/list-retard-tva/list-retard-tva.component';

@NgModule({
  declarations: [
    AppComponent,
    SaveSocieteComponent,
    SocieteListComponent,
    CreateTauxTaxIsComponent,
    ListTauxTaxIsComponent,
    CreateRetardTvaComponent,
    ListRetardTvaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
