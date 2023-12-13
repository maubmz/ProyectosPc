import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductoListComponent } from './producto-list/producto-list.component';

const routes: Routes = [
{
  path: 'productosFindBy/:id',
  component: ProductoListComponent
},
{
  path: 'getProductos',
  component: ProductoListComponent
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
export class ProductosRoutingModule { }
