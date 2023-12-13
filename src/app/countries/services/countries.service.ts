import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, delay, map, of, tap } from 'rxjs';

import { Country } from '../interfaces/country';
import { CacheStore } from '../interfaces/cache-store.interface';
import { Region } from '../interfaces/region.type';

@Injectable({
  providedIn: 'root'
})
export class CountriesService {

  private apiUrl: string = 'https://restcountries.com/v3.1';

  public cacheStore: CacheStore= {//Guarda el historial de lo que se busco
    byCapital:    { term: '', countries: [] },
    byCountries:  { term: '', countries: [] },
    byRegion:     { region: '', countries: [] }

  }

  constructor( private http: HttpClient ) {
    this.loadFromLocalStorage();
   }

  private saveToLocalStorage() {//Convierte el cacheStore en un JSON
    localStorage.setItem( 'cacheStore', JSON.stringify( this.cacheStore ));
  }

  private loadFromLocalStorage() {//Carga el cacheStore donde primero valida si el cacheStore tiene informacion
    if ( !localStorage.getItem( 'cacheStore') ) return;

    this.cacheStore = JSON.parse( localStorage.getItem('cacheStore')! )
  }

  private getCountriesRequest( url: string ): Observable<Country[]> {
    return this.http.get<Country[]>( url )
      .pipe(
        catchError( () => of([]) ),//Atrapa el error si es que existe cuando se hace la peticion get del servicio REST
        delay( 100 ),//Le agrega un delay a la busqueda de 2segundos
    );
  }


  searchCountryByAlphaCode( code: string): Observable<Country | null> {

    const url = `${ this.apiUrl }/alpha/${ code }`;

    return this.http.get<Country[]>( url )
      .pipe(
        map( countries => countries.length > 0 ? countries[0] : null ),
        catchError( () => of( null ))
      );
  }

  searchCapital( term: string ): Observable<Country[]> {

    const url = `${ this.apiUrl }/capital/${ term }`;
    return this.getCountriesRequest( url )
      .pipe(
        tap( countries => this.cacheStore.byCapital = {term, countries}),//ingresa los valores de la busqueda en el cacheStore
        tap( () => this.saveToLocalStorage() ),//Ademas los agrega en el metodo save para agregar el cambio
      );
    //Se ejecuta esta peticion cuando se suscribe
  }

  searchCountry( term: string ): Observable<Country[]> {

    const url = `${ this.apiUrl }/name/${ term }`;
    return this.getCountriesRequest( url )
      .pipe(
        tap( countries => this.cacheStore.byCountries  = {term, countries}),//ingresa los valores de la busqueda en el cacheStore
        tap( () => this.saveToLocalStorage() ),//Ademas los agrega en el metodo save para agregar el cambio
      )
  }

  searchRegion( region: Region ): Observable<Country[]> {

    const url = `${ this.apiUrl }/region/${ region }`;
    return this.getCountriesRequest( url )
      .pipe(
        tap( countries => this.cacheStore.byRegion = { region , countries}),//ingresa los valores de la busqueda en el cacheStore
        tap( () => this.saveToLocalStorage() ),//Ademas los agrega en el metodo save para agregar el cambio
      )
  }

}
