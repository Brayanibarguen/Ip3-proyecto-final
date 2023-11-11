package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.domain.Estudiante;

import java.util.List;

public interface VerEstudianteService {
    List<Estudiante> obtenerEstudiantes();
}
