import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { HomePageBaseComponent } from './pages/home-page.component';
import { ClientesListComponent } from './components/Cliente/clientes-list/clientes-list.component';
import { ProductoListComponent } from './components/Producto/producto-list/producto-list.component';
import { FacturaListComponent } from './components/Factura/facturas-list/facturas-list.component';
import { FacturasRoutingModule } from './components/Factura/facturas-routing.module';
import { ProductosRoutingModule } from './components/Producto/productos-routing.module';



@NgModule({
  declarations: [
    HomePageBaseComponent,
    ClientesListComponent,
    FacturaListComponent,
    ProductoListComponent,
  ],//Components
  imports: [
    CommonModule,
    RouterModule,
    HttpClientModule,
    FacturasRoutingModule,
    ProductosRoutingModule,
  ],//Modules
  exports: [
    HomePageBaseComponent,
    RouterModule,
  ],//Exterior

})
export class BaseDataModule {

}
