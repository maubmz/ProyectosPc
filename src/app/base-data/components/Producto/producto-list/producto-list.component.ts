import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs';

import { Producto } from 'src/app/base-data/interfaces/Producto.interface';
import { BaseDataService } from 'src/app/base-data/services/base-data.service';

@Component({
  selector: 'app-producto-list',
  templateUrl: './producto-list.component.html',
})
export class ProductoListComponent implements OnInit{

  productos?:   Producto[];

  constructor(
    private activatedRoute: ActivatedRoute,
    private baseDataService: BaseDataService,
  ) { }

  findProductosById(): void {
    this.activatedRoute.params
      .pipe(
        switchMap( ({ id }) => this.baseDataService.searchProductosById( id )),
      )
      .subscribe( productos => {
        return this.productos = productos;
      })
  }

  ngOnInit(): void {
    this.findProductosById();
  }

}
