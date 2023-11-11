package com.ejemplo.estudiantes.infrastructure.repository.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "estudiante")
@Data
@Builder
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;
}
