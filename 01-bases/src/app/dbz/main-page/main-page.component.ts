import { Component } from '@angular/core';

import { Personaje } from '../interfaces/dbz.interface';
import { DbzService } from '../services/dbz.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html'
})
export class MainPageComponent {

  nuevoMainPage: Personaje = {
    nombre: '',
    poder: 0
  }

  constructor( ) { }

  // cambiarNombre( event: any) { //Con esta funcion se ocupa para imprimir en consola lo que nos da el usuario en el input
  //   console.log( event.target.value );
  // }

}
