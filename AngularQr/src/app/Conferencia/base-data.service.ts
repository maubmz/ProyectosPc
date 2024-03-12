import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Params } from '@angular/router';
import { Estudiante } from '../Entidades/Estudiante';

@Injectable({
  providedIn: 'root'
})
export class
BaseDataService {

  private baseUrl: string;

  constructor( private http: HttpClient ) {
    this.baseUrl = 'http://localhost:8080';
   }

   searchEstudianteById( EstudianteId: number): Observable<Estudiante[]> {
    const url = `${ this.baseUrl }/estudiante/${ EstudianteId }`;
    return this.http.get<Estudiante[]>( url )
  }

  searchEstudianteAll( ): Observable<Estudiante[]> {
    const url = `${ this.baseUrl }/estudiante/all`;
    return this.http.get<Estudiante[]>( url )
  }

  

  /*searchAllCliente(  ): Observable<Cliente[]> {
    const url = ${ this.baseUrl }/cliente;
    return this.http.get<Cliente[]>( url );
  }


  searchAllFactura( ): Observable<Factura[]> {
    const url = ${ this.baseUrl }/factura/getFacturas;
    return this.http.get<Factura[]>( url )
  }


  searchFacturaById( clienteId: string): Observable<Factura[]> {
    const url = ${ this.baseUrl }/factura/cliente/${ clienteId };
    return this.http.get<Factura[]>( url )
  }


  searchProductosById( facturaId: string): Observable<Producto[]> {
    const url = ${ this.baseUrl }/producto/productosFindIdFactura/${ facturaId };
    return this.http.get<Producto[]>( url )
  }
*/

}