import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs';

import { Factura } from 'src/app/base-data/interfaces/Factura.interface';
import { BaseDataService } from 'src/app/base-data/services/base-data.service';

@Component({
  selector: 'Factura-factura-list',
  templateUrl: './facturas-list.component.html',
})
export class FacturaListComponent implements OnInit{

  facturas!:    Factura[];

  constructor(
    private activatedRoute: ActivatedRoute,
    private baseDataService: BaseDataService,
    ){ }

  findAllFactura( ): void {//imprime todas las facturas de todos los clientes
    this.baseDataService.searchAllFactura()
      .subscribe( facturas => {
        return this.facturas = facturas;
      })
  }

  // clienteId = this.activatedRoute.snapshot.params['clienteId'];
  findFacturasById(): void {//imprime las facturas por cada numero de cliente
    this.activatedRoute.params
      .pipe(//los metodos que esten dentro de pipe nos los ejecutara en una secuencia
        switchMap( ({ id }) => this.baseDataService.searchFacturaById( id )),//Switchmap recibe el id de activatedRoute y se los envia por parametros a searchFacturaById
      )
      .subscribe( facturas => {//imprime las facturas
        return this.facturas = facturas;
      })

  }

  ngOnInit(): void {
    this.findFacturasById();

  }




}
