import { Component, Input } from '@angular/core';
import { Persona } from '../../interfaces/persona.interface';

@Component({
  selector: 'app-matriz',
  templateUrl: './matriz.component.html',
})
export class MatrizComponent  {

  public personaArreglo : Persona[] = [{
    nombre: 'Miguel',
    edad: 24,
    estatura: 1.75
  },{
    nombre: 'Pao',
    edad: 19,
    estatura: 1.63
  },{
    nombre: 'Juan',
    edad: 23,
    estatura: 1.73
  }];

  @Input()
  public personaAddArreglo: Persona[] = [{
    nombre: '',
    edad: 0,
    estatura: 0
  }]
}
