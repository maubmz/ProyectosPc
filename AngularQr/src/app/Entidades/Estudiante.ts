import { Conferencia } from "./Conferencia";
export interface Estudiante {
    noCuenta: number;
    nombre: string;
    apellidos: string;
    correo: string;
    constancias?: Conferencia[];
  }
  