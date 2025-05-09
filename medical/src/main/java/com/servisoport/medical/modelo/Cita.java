package com.servisoport.medical.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate fecha = LocalDate.now();

    @Column(name = "motivo_cita")
    private String motivoDeCita;

    private String especializacion;
//    @ManyToOne
//    @JoinColumn(name = "especializacion_id", referencedColumnName = "id")
//    private Especializacion especializacion;
}
