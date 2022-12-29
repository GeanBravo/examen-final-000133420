package com.examen._000133420.domain.repositories;



import com.examen._000133420.domain.models.Reporte;

import java.util.List;

public interface ReporteRepository {
    Reporte save(Reporte reporte);
    List<Reporte> getAll();
    Reporte getOne(Long id);
    void delete(Long id);
}
