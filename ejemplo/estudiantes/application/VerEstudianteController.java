package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.infrastructure.repository.VerEstudianteRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class VerEstudianteController {

    private final VerEstudianteRepository verEstudianteRepository;

    @GetMapping
    public String obtenerEstudiantes() throws JsonProcessingException {
        String estudiantes = verEstudianteRepository.toString();
        return new ObjectMapper().writeValueAsString(estudiantes);
    }
}
