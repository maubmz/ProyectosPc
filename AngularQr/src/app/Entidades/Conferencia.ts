export class Conferencia {
    idConstancia: number;
    fecha: Date;
    titulo: string;
    
    
    constructor() {
      this.idConstancia = 0;
      this.fecha = new Date();
      this.titulo = ''; // Agrega un valor inicial para 'titulo'
    }
  }