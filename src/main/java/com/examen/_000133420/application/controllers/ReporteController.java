package com.examen._000133420.application.controllers;

import com.examen._000133420.domain.models.Reporte;
import com.examen._000133420.domain.services.ReporteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "reportes")
@AllArgsConstructor
public class ReporteController {
    private ReporteService reporteService;
    @PostMapping
    ResponseEntity<Reporte> create(@RequestBody Reporte reporte) {
        Reporte reportec = this.reporteService.create(reporte);
        return new ResponseEntity<>(reportec, HttpStatus.CREATED);
    }

}
