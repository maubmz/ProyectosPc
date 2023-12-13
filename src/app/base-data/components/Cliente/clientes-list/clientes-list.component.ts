import { Component, OnInit} from '@angular/core';

import { Cliente } from 'src/app/base-data/interfaces/Cliente.interface';
import { BaseDataService } from 'src/app/base-data/services/base-data.service';


@Component({
  selector: 'Cliente-clientes-list',
  templateUrl: './clientes-list.component.html',
})
export class ClientesListComponent implements OnInit{

  public clientes!: Cliente[];

  constructor( private baseDataService: BaseDataService ) { }

  findAllCliente( ): void {
    this.baseDataService.searchAllCliente()
      .subscribe( cliente => {
        this.clientes = cliente;
      })
  }


  ngOnInit(): void {
    this.findAllCliente();
  }

}
