import { Component } from '@angular/core';

@Component({
  selector: 'app-basics-page',
  templateUrl: './basics-page.component.html',
  styleUrls: ['./basics-page.component.css']
})
export class BasicsPageComponent {
  public nameLower: string = 'Mauricio';
  public nameUpper: string = 'MAURICIO';
  public fullName: string = 'MauRIcIo BaEZa';

}
