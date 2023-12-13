import { Component, Output, EventEmitter } from '@angular/core';
import { Persona } from '../../interfaces/persona.interface';

@Component({
  selector: 'app-add-persona',
  templateUrl: './add-persona.component.html',
  styleUrls: ['./add-persona.component.css']
})
export class AddPersonaComponent {

  @Output()
  public onNewPersona: EventEmitter<Persona> = new EventEmitter();

  public persona: Persona = {
    nombre: '',
    edad: 0,
    estatura: 0
  };

  emitePersonaje(): void {

    if( this.persona.nombre.length === 0)
      return this.onNewPersona.emit(this.persona);


    this.persona = {//Se reiniciara al subir a la persona al arreglo
      nombre: ' ',
      edad: 0,
      estatura: 0
    }
  }


}
