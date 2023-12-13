import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Gif, SearchResponse } from '../interfaces/gifs.interface';

@Injectable({providedIn: 'root'})
export class GifsService {

  public gifList: Gif[] = [];

  private _tagHistory: string[] = [];
  private apiKey: string = '5x013BijqvW9KK8q0X08bcV014XtmPnt';
  private serviceUrl: string = 'https://api.giphy.com/v1/gifs';

  constructor( private http: HttpClient ) {
    this.loadLocalStorage();
    console.log('Gifs service');
   }

  get tagsHistory() {
    return [...this._tagHistory];
    //Se ocupa el operador spread para crear copia del tagHistory
  }

  private organizeHistory( tag: string ) {
    tag = tag.toLowerCase();

    if( this._tagHistory.includes( tag ) ) {
      this._tagHistory = this._tagHistory.filter( (oldTag) => oldTag !== tag )
    }//Si esta en el tagHistory se elimina por medio de un filtro.

    this._tagHistory.unshift( tag );//Inserta el nuevo tag
    this._tagHistory = this._tagHistory.splice( 0, 10 );//Un limite de 10 tag en el arreglo de tagHistory
    this.saveLocalStorage();
  }

  private saveLocalStorage(): void {
    localStorage.setItem('history', JSON.stringify( this._tagHistory) );//El tag history lo convertiremos en JSON para guardar el historial con el nombre de 'history'
    //Se encuentra en el inspectElement/Application
  }

  private loadLocalStorage(): void {
    if( !localStorage.getItem('history')) return;

    this._tagHistory = JSON.parse( localStorage.getItem('history')! );//conviertes el JSON en string para pasarselo al _tagHistory
    if( this._tagHistory.length === 0) return;
    this.searchTag( this._tagHistory[0]);//Hace que el metodo searchTag nos busque el primer elemento del _tagHistory
  }

  searchTag( tag: string): void {//Buscar los valores del tag
    if( tag.length === 0) return;
    this.organizeHistory( tag );

    const params = new HttpParams()
      .set('api_key', this.apiKey)
      .set('limit', 10)
      .set('q', tag)

    this.http.get<SearchResponse>(`${ this.serviceUrl}/search`, {params} )
      .subscribe( resp => {

      this.gifList = resp.data;

    })
    // console.log(this.tagsHistory);
  }

}
