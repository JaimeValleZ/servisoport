import { Routes } from '@angular/router';
import { CitaComponent } from './pages/cita/cita.component';

export const routes: Routes = [
    {
        path: 'agendar-cita',
        component: CitaComponent,
        pathMatch: 'full'
    }
];
