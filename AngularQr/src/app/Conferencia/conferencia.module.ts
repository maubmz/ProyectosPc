import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConferenciaQrComponent } from './conferencia-qr/conferencia-qr.component';

@NgModule({
  //declarations: [ConferenciaQrComponent],
  imports: [CommonModule,ConferenciaQrComponent],
 exports: [ConferenciaQrComponent],
})
export class ConferenciaQrModule { }
