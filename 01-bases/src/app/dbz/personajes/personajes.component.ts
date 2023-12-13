import { Component, Input } from '@angular/core';

import { Personaje } from '../interfaces/dbz.interface';
import { DbzService } from '../services/dbz.service';

@Component({
  selector: 'app-personajes',
  templateUrl: './personajes.component.html',
})
export class PersonajesComponent {

  // @Input() personajes: Personaje[] = []; //"@Input()" Estos personajes van a venir de componente padre, se dara la propiedad en el html padre
  // //Si queremos llamar de otra  forma en el html padre , debemos de agregarle el nombre en los parentesis del Input.

  get personajes() {
    return this.dbzService.personajes;
  }

  constructor(private dbzService: DbzService ) { }

}
