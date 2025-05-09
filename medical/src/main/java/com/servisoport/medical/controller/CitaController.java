package com.servisoport.medical.controller;

import com.servisoport.medical.modelo.Cita;
import com.servisoport.medical.service.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita")
@CrossOrigin("*")
@RequiredArgsConstructor
public class CitaController {

    private final CitaService citaService;

    @PostMapping("/agendar")
    public Cita guardarCita(@RequestBody Cita cita){
        return citaService.crearCita(cita);
    }

    @GetMapping("/todas-citas")
    public List<Cita> verCitas(){
        return citaService.verCitas();
    }
}
