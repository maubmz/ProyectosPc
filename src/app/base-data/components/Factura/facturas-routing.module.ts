import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FacturaListComponent } from './facturas-list/facturas-list.component';

const routes: Routes = [
  {
    path: 'facturasFindBy/:id',
    component: FacturaListComponent
  },
  {
    path: 'getfacturas',
    component: FacturaListComponent
  }
]

@NgModule({
  imports: [
    RouterModule.forChild( routes )
  ],
  exports: [
    RouterModule
  ],
})
export class FacturasRoutingModule { }
