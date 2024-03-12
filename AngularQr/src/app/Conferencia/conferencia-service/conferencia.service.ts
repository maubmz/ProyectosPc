import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Conferencia } from 'src/app/Entidades/Conferencia';

@Injectable({
  providedIn: 'root'
})
export class ConferenciaService {
  //constructor(private conferenciaService: ConferenciaService) {}
  private apiUrl = 'http://localhost:8080/constancia'; // Asegúrate de reemplazar esto con la URL de tu API

  constructor(private http: HttpClient) { }

  getConferencias(): Observable<any> {
    return this.http.get(this.apiUrl+ "/all");
  }
  obtenerConferenciasPorNumeroCuentaArray(numeroCuentas: number[]): Observable<Conferencia[]> {
    const url = `${this.apiUrl}?numeroCuentas=${numeroCuentas.join(',')}`;
    return this.http.get<Conferencia[]>(url);
  }
}
