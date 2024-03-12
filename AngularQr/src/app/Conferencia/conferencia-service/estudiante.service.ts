import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Estudiante } from 'src/app/Entidades/Estudiante';

@Injectable({
  providedIn: 'root'
})
export class EstudianteService {
  private apiUrl = 'http://localhost:8080/estudiante'; // Cambia la URL según tu API

  constructor(private http: HttpClient) { }

  obtenerEstudiantePorNoCuenta(noCuenta: number): Observable<Estudiante> {
    const url = `${this.apiUrl}/${noCuenta}`;
    return this.http.get<Estudiante>(url);
  }

  // Si necesitas más métodos, como guardar, actualizar, eliminar, etc., puedes agregarlos aquí.
}
