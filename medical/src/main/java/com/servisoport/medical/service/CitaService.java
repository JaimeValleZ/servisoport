package com.servisoport.medical.service;

import com.servisoport.medical.modelo.Cita;

import java.util.List;

public interface CitaService {

    public Cita crearCita(Cita cita);

    public List<Cita> verCitas();
}
