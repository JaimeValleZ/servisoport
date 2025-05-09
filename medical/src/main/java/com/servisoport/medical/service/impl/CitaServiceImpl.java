package com.servisoport.medical.service.impl;

import com.servisoport.medical.modelo.Cita;
import com.servisoport.medical.repository.CitaRepository;
import com.servisoport.medical.service.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CitaServiceImpl implements CitaService {

    private final CitaRepository citaRepository;

    @Override
    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public List<Cita> verCitas() {
        return citaRepository.findAll();
    }
}
