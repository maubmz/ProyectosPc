import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent {
  constructor() {}

  resultado: string  = '0';
  calculo: string = " ";

  numero1: number = 0;
  numero2: number = 0;
  operador: string = '';

  getInputValue(value: any ) {
    this.resultado += value;

  }

  result(): void {
    const valor = this.resultado.split(this.operador);
    this.numero1 = parseFloat(valor[0]);
    this.numero2 = parseFloat(valor[1]);
    console.log(this.operador , this.numero1 , this.numero2)
    let resultadoFinal: number = 0;
    switch(this.operador){
      case "+":
        resultadoFinal = this.numero1 + this.numero2;
        console.log(resultadoFinal);
        break;
      case "-":
        resultadoFinal = this.numero1 - this.numero2;
        break;
      case "/":
        resultadoFinal = this.numero1 / this.numero2;
        break;
      case "*":
        resultadoFinal = this.numero1 * this.numero2;
        break;

    }
    this.resultado = resultadoFinal.toString();


  }

  borrar() {
    this.resultado.slice(0,-1);

  }

}
