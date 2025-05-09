import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baserUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class MetodosService {

  constructor(private httpClient: HttpClient) {}

  public crearCita(cita:any){
    return this.httpClient.post(`${baserUrl}/cita/agendar`, cita)
  }
}
