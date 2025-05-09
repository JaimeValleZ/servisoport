package com.servisoport.medical.repository;

import com.servisoport.medical.modelo.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}
