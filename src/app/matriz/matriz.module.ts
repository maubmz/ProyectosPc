import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";

import { AddPersonaComponent } from "./components/add-persona/add-persona.component";
import { MatrizComponent } from "./components/matriz/matriz.component";
import { MainPageComponent } from "./pages/main-page.component";
import { CommonModule } from "@angular/common";

@NgModule({
  declarations:[
    MainPageComponent,
    AddPersonaComponent,
    MatrizComponent,
  ],
  exports: [
    MainPageComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
})
export class MatrizModule{

}
