package com.servisoport.medical.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Especializacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDeCita;

    @OneToMany(mappedBy = "especializacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Cita> cita;
}
