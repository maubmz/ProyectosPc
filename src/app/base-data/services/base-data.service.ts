import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from '../interfaces/Cliente.interface';
import { Factura } from '../interfaces/Factura.interface';
import { Params } from '@angular/router';
import { Producto } from '../interfaces/Producto.interface';

@Injectable({
  providedIn: 'root'
})
export class
BaseDataService {

  private baseUrl: string;

  constructor( private http: HttpClient ) {
    this.baseUrl = 'http://localhost:8080';
   }

  searchAllCliente(  ): Observable<Cliente[]> {

    const url = `${ this.baseUrl }/cliente`;
    return this.http.get<Cliente[]>( url );
  }


  searchAllFactura( ): Observable<Factura[]> {

    const url = `${ this.baseUrl }/factura/getFacturas`;
    return this.http.get<Factura[]>( url )
  }


  searchFacturaById( clienteId: string): Observable<Factura[]> {

    const url = `${ this.baseUrl }/factura/facturasFindIdCliente/${ clienteId }`;
    return this.http.get<Factura[]>( url )
  }


  searchProductosById( facturaId: string): Observable<Producto[]> {
    const url = `${ this.baseUrl }/producto/productosFindIdFactura/${ facturaId }`;
    return this.http.get<Producto[]>( url )
  }


}
