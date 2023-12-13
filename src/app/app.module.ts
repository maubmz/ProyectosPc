import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CalculadoraComponent} from './calculadora/calculadora.component';
import { MatrizModule } from './matriz/matriz.module';

@NgModule({
  declarations: [
    AppComponent,
    CalculadoraComponent,
  ],
  imports: [
    BrowserModule,
    MatrizModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
