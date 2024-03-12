import { Component } from '@angular/core';
import { ConferenciaService } from './conferencia.service';
import { HttpClientModule } from '@angular/common/http';


@Component({
  selector: 'app-conferencia-service',
  standalone: true,
  imports: [
    HttpClientModule
  ],
  templateUrl: './conferencia-service.component.html',
})
export class ConferenciaServiceComponent {
        
}
