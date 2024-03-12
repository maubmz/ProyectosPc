import { Component } from '@angular/core';
import { Estudiante } from '../../Entidades/Estudiante';
import { FormBuilder, FormGroup, FormsModule, Validators } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { BaseDataService } from '../base-data.service';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { QrCodeService } from '../qr-code.service';

@Component({
  selector: 'app-conferencia-qr',
  templateUrl: './conferencia-qr.component.html',
  standalone: true,
  imports:[
    CommonModule
  ]
})
export class ConferenciaQrComponent {
  estudiantes: Estudiante[] = [];
  qrCodeUrl: string | undefined;

  constructor(private baseDataService: BaseDataService,
    private qrCodeService: QrCodeService
    ) {}

  ngOnInit() {
    this.getStudents();
  }
  getStudentColorClass(index: number) {
    const colors = ['list-group-item-primary', 'list-group-item-secondary', 'list-group-item-success', 'list-group-item-danger', 'list-group-item-warning', 'list-group-item-info', 'list-group-item-light', 'list-group-item-dark'];
    return colors[index % colors.length];
  }

  getStudents() {
     this.baseDataService.searchEstudianteAll().subscribe((data: Estudiante[]) => {
      this.estudiantes = data;
    });
  }
  async generateQrCode(estudiante: Estudiante) {
    try {
      const qrData = {
        estudiante,
        conferencias: estudiante.constancias
      };
      this.qrCodeUrl = await this.qrCodeService.generateQrCode(qrData);
    } catch (error) {
      console.error('Error generando código QR:', error);
    }
  }

  print() {
    window.print();
  }
}
