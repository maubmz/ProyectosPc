import {  NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ClientesListComponent } from './base-data/components/Cliente/clientes-list/clientes-list.component';

const routes: Routes = [
  {
    path: 'cliente',
    component: ClientesListComponent
  },
  {
    path: 'factura',
    loadChildren: () => import('./base-data/base-data.module').then( f => f.BaseDataModule)
    //Le cargamos un submodulo de rutas al modulo raiz de rutas
  },
  {
    path: 'producto',
    loadChildren: () => import('./base-data/base-data.module').then( p => p.BaseDataModule)
  },
]

@NgModule({
  imports: [
    RouterModule.forRoot( routes ),
  ],
  exports: [
    RouterModule
  ],
})
export class AppRoutingModule {}
