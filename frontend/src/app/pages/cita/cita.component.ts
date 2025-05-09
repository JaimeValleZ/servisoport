import { Component } from '@angular/core';
import { MetodosService } from '../../services/metodos.service';

@Component({
  selector: 'app-cita',
  standalone: true,
  imports: [],
  templateUrl: './cita.component.html',
  styleUrl: './cita.component.css'
})
export class CitaComponent {

  cita={
    fecha: '',
    motivoDeCita: '',
    especializacion: ''
  }

  constructor(private metodosService: MetodosService) {}

  guardarCita() {
    console.log('Datos enviados:', this.cita);
    this.metodosService.crearCita(this.cita).subscribe(
      (response) => {
        console.log('Cita creada exitosamente:', response);
        alert('¡Cita agendada exitosamente!');
      },
      (error) => {
        console.error('Error al agendar cita:', error);
        alert('Ocurrió un error al agendar la cita.');
      }
    );
  }

}
