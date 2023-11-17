package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.ActualizarEstudianteService;
import com.ejemplo.estudiantes.application.CreacionEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ActualizarEstudianteController {

    private final ActualizarEstudianteService actualizarEstudianteService;

    /**
     * permite la actualizacion de un estudiante a traves del metodo HTTP POST
     * Recibe como body en el request HTTP un JSON con la información del estudiante.
     */
    @PostMapping
    public Estudiante actualizarEstudiante(@RequestBody Estudiante estudiante){
        log.info("Se va actualizar un estudiante");
        return actualizarEstudianteService.actualizarEstudiante(estudiante);
    }

}
