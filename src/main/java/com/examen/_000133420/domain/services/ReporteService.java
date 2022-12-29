package com.examen._000133420.domain.services;



import com.examen._000133420.domain.models.Reporte;

import java.util.List;


public interface ReporteService {
    Reporte create(Reporte reporte);
    List<Reporte> getAll();
    Reporte update(Reporte reporte);
}
